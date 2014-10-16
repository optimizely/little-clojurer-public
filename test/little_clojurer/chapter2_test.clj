(ns little-clojurer.chapter2_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter2 :refer :all]))

(deftest lat?-test
  (testing
    (is (not (lat? :a)))
    (is (not (lat? '('()))))
    (is (lat? '()))
    (is (lat? '(:a)))
    (is (lat? '(:a 1)))))
