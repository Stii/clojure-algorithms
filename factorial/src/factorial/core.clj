(ns factorial.core
  (:gen-class))

(defn factorial
  "Recursive factorial number"
  [number]
  (if (= number 0)
    1
    (* number (factorial (- number 1)))))

(defn -main
  "For example: factorial 5! = 5*4*3*2*1=120."
  [& args]
  (println (factorial 10)))
