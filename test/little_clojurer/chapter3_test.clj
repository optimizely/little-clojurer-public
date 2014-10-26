(ns little-clojurer.chapter3_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter3 :refer :all]))

(deftest rember-test
  (testing
    (is (= '(1 3 4) (rember 2 '(1 2 3 4))))
    (is (= '(1 2 3 4) (rember 5 '(1 2 3 4))))
    (is (= '() (rember 5 '())))
    (is (= '() (rember :a '())))
    (is (= '(2 1 3 4 1) (rember 1 '(1 2 1 3 4 1))))))
