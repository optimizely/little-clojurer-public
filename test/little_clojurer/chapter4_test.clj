(ns little-clojurer.chapter4_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter4 :refer :all]))

(deftest addtup-test
  (testing
    (is (= 0 (addtup '())))
    (is (= 0 (addtup '(0))))
    (is (= 0 (addtup '(0 0))))
    (is (= 0 (addtup '(-1 1 0 -5 2 3))))
    (is (= 1 (addtup '(1))))
    (is (= -10 (addtup '(1 -11))))
    (is (= -2 (addtup '(-1 -1))))
    (is (= 0 (addtup '(-1 1 0))))))


(deftest tup+-test
  (testing
    (is (= '() (tup+ '() '())))
    (is (= '(1) (tup+ '(1) '(0))))
    (is (= '(1 0) (tup+ '(1 1) '(0 -1))))
    (is (= '(1 2 3 4) (tup+ '(1 2 3 4) '(0 0 0 0))))))


(deftest pick-test
  (testing
    (is (= 1 (pick 1 (range 10))))
    (is (= 5 (pick 5 (range 10))))
    (is (= :b (pick 1 '(:a :b :c))))))


(deftest rempick-test
  (testing
    (is (= '(0 1 3) (rempick 2 (range 4))))
    (is (= '(1 2 3) (rempick 0 (range 4))))
    (is (= '() (rempick 0 '())))
    (is (= '() (rempick 0 '(:a))))
    (is (= '(:b) (rempick 0 '(:a :b))))))


(deftest no-nums-test
  (testing
    (is (= '() (no-nums '())))
    (is (= '() (no-nums (range 4))))
    (is (= '(:a) (no-nums '(1 2 3 :a 4 5))))
    (is (= '(:a :b) (no-nums '(1 2 3 :a 4 5 :b))))))


(deftest all-nums-test
  (testing
    (is (= '() (all-nums '())))
    (is (= '() (all-nums '(:a :b :c))))
    (is (= (range 4) (all-nums (range 4))))
    (is (= '(1 2 3 4 5) (all-nums '(1 2 3 :a 4 5))))
    (is (= '(1 2 3 4 5) (all-nums '(1 2 3 :a 4 5 :b))))))
