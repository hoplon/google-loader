(ns hoplon.google.jsapi.loader
  (:require [hoplon.core  :as h]
            [javelin.core :as j]))

(j/defc  api-key nil)
(j/defc= api-url (str "https://www.google.com/jsapi?key=" api-key))

(defn queued [load-fn]
  (let [callbacks (atom [])
        status    (atom nil)]
    (fn [callback]
      (if (= :complete @status)
        (callback)
        (do (swap! callbacks conj callback)
            (when-not @status
              (reset! status :loading)
              (load-fn #(do (reset! status :complete)
                            (doseq [f @callbacks] (f))))))))))

(def ensure-api
  (queued
    (fn [callback]
      (h/with-init! (.getScript js/jQuery @api-url callback)))))
