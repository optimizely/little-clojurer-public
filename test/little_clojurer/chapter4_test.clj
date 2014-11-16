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
