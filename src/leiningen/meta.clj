(ns leiningen.meta
  (:refer-clojure :exclude [meta]))

(defn meta
  "Print the specified attribute."
  [project attribute]
  (-> attribute keyword project println))
