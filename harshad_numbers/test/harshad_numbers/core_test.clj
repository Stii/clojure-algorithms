(ns harshad-numbers.core-test
  (:require [clojure.test :refer :all]
            [harshad-numbers.core :refer :all]))

(deftest test-sum-digits
  (testing "Testing the sum of a number's digits"
    (is (= 9 (sum-digits 153 0)))
    (is (= 8 (sum-digits 152 0)))
    (is (= 1 (sum-digits 10 0)))))

(deftest test-harshad?
  (testing "Test is a number is a Harshad number"
    (is (harshad? 153))
    (is (harshad? 152))
    (is (harshad? 198))
    (is (not (harshad? 151)))))

(deftest test-harshad-str
  (testing "The string output"
    (is (= "The number 153 is a harshad number." (harshad-output 153)))))
