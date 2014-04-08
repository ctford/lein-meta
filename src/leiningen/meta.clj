(ns leiningen.meta)

(defn meta
  "Print the specified attribute."
  ([project attribute]
   (-> attribute keyword project println)))
