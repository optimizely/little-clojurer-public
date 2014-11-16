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
