(ns one.core)
(defn big [st n]
    (> (count st) n)
)
(defn collection-type [col]
    (cond
        (list? col) :list
        (vector? col) :vector
        (map? col) :map
        :else :invalid-type
    )
)
(defn -main [& args]
    (println "(big st n)")
    (println (big "asdafddsfadsasdasddfasdfs" 10))
    (println (big "asdafddsfadsasdasddfasdfs" 30))

    (def a_list '(1 2 3 4 5 6))
    (def a_map {:a "a" :b "b" :c "c"})
    (def a_vector [7 8 9 10])
    
    (println 'a_list " is a " (collection-type a_list))
    (println 'a_vector " is a " (collection-type a_vector))
    (println 'a_map " is a " (collection-type a_map))
    (println :foo " is a " (collection-type :foo))
)
