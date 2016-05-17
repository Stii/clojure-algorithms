(ns harshad-numbers.core
  (:gen-class))

(defn sum-digits
  "Sum the digits of a number"
  [number total]
  (if (> number 0)
    (sum-digits (int (/ number 10)) (+ total (mod number 10)))
    total))

(defn harshad?
  "If the remainder for the sum of the digits is 0, it is a Harshad number"
  [number]
  (= (mod number (sum-digits number 0)) 0))

(defn harshad-output
  "Generate a nice looking string output for our test"
  [number]
  (let [harshad-str (if (harshad? number)
                      " "
                      " not ")]
    (str "The number " number " is" harshad-str "a harshad number.")))

(defn -main
  "A Harshad Number, in a given number base, is an integer that is 
  divisible by the sum of its digit when written in that base.
  Write a function that returns whether an integer is a 
  Harshad Number or not (in base 10)."
  [& args]
  (let [number (read-string (first args))]
    (println (harshad-output number))))

