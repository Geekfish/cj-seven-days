(ns two.core)

(defmacro unless [test body else-body]
  (list 'if (list 'not test) body else-body))

(defn test-macro [test]
  (unless test
          (println "This should normally happen")
          (println "Fuuuuuuuuuu-")))

(defn -main [& args]
  (test-macro true)
  (test-macro false)
      
)
