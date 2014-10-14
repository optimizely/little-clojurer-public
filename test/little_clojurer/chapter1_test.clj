(ns little-clojurer.chapter1_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter1 :refer :all]))

(deftest car-test
  (testing "FIXME, I fail."
    (is (= :a (car '(:a))))
    (is (= 1 (car '(1 :b))))))
