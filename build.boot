(set-env!
  :resource-paths #{"src"}
  :dependencies '[[boot/core                  "2.0.0-rc9"     :scope "provided"]
                  [adzerk/bootlaces           "0.1.9"         :scope "test"]
                  [tailrecursion/boot-hoplon  "0.1.0"         :scope "test"]
                  [tailrecursion/hoplon       "6.0.0-SNAPSHOT"]])

(require '[adzerk.bootlaces :refer :all]
         '[tailrecursion.boot-hoplon :refer :all])

(def +version+ "0.1.0")

(task-options!
 pom  {:project     'hoplon/hoplon-google-loader
       :version     +version+
       :description "hoplon wrapper for google loader"
       :url         "https://developers.google.com/maps/documentation/javascript/"
       :scm         {:url "https://github.com/hoplon/hoplon-google-loader.git"}
       :license     {"" ""}})

