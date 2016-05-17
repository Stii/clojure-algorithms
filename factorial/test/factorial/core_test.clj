(ns factorial.core-test
  (:require [clojure.test :refer :all]
            [factorial.core :refer :all]))

(deftest test-factorial
  (testing "Test the factorial numbers"
    (is (= (factorial 1) 1))
    (is (= (factorial 5) 120))
    (is (= (factorial 10) 3628800))))
