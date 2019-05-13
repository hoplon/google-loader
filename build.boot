(set-env!
  :resource-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.12"        :scope "test"]
                  [hoplon           "6.0.0-alpha10"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.2.0")

(task-options!
 pom  {:project     'hoplon/google-loader
       :version     +version+
       :description "hoplon wrapper for google loader"
       :url         "https://developers.google.com/maps/documentation/javascript/"
       :scm         {:url "https://github.com/hoplon/google-loader.git"}
       :license     {"" ""}})

