(ns collatz.core
  (:gen-class))

(defn collatz
  [n sequence]
  (let [sequence (conj sequence n)]
  (cond
     (= n 1) sequence
     (even? n) (collatz (/ n 2) sequence)
     :else  (collatz (+ (* n 3) 1) sequence))))

(defn -main
  "I don't do a whole lot ... yet."
  [n]
  (let [sequence (collatz (Integer. n) [])]
       (do (println sequence)
           (println (count sequence)))))
