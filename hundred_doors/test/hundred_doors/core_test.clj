(ns hundred-doors.core-test
  (:require [clojure.test :refer :all]
            [hundred-doors.core :refer :all]))

(deftest test-state-of-door-closed
  (testing "The state of a door is closed"
    (is (= "Close" (state-of-door (Math/sqrt 3))))))

(deftest test-state-of-door-open
  (testing "The state of a door open"
    (is (= "Open" (state-of-door (Math/sqrt 81))))))

(deftest test-door-str-open
  (testing "The output for a open door"
    (is (= "#9: Open\n" (door-str 9)))))

(deftest test-door-str-closed
  (testing "The output for a closed door"
    (is (= "#12: Close\n" (door-str 12)))))
