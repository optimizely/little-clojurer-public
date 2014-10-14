(ns little-clojurer.chapter1_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter1 :refer :all]))

(deftest car-test
  (testing
    (is (= :a (car '(:a))))
    (is (= 1 (car '(1 :b))))))

(deftest cdr-test
  (testing
    (is (= '() (cdr '(:a))))
    (is (= '(:b) (cdr '(1 :b))))))
