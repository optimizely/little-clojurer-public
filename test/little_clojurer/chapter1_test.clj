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

(deftest null?-test
  (testing
    (is (not (null? '(:a))))
    (is (not (null? '(1))))
    (is (null? '()))
    (is (null? nil))))

(deftest atom?-test
  (testing
    (is (not (atom? '())))
    (is (not (atom? '(1))))
    (is (not (atom? [1])))
    (is (atom? nil))
    (is (atom? 1))
    (is (atom? :a))))
