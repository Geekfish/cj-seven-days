(ns two.core)
(defn big [st n]
    (> (count st) n)
)
(defn collection-type [col]
    (println col "is a" 
        (cond
            (list? col) :list
            (vector? col) :vector
            (map? col) :map
            :else :invalid-type
        )))

(defn test-collection-type []
   (map collection-type [
        [1 2 3 4 5] '(6 7 8 9) {:a "a", :b "b", :c "c"} :foo
    ])
)
(defn -main [& args]
    (println "(big st n)")
    (println (big "Hello world" 10))
    (println (big "Hello foo" 10))

    (test-collection-type)
)
