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

(deftest member?-test
  (testing
    (is (not (member? :a '())))
    (is (not (member? 1 '())))
    (is (not (member? '() '('()))))
    (is (member? :a '(:a :a :a)))
    (is (member? 1 '(:a 1 :a)))
    (is (member? :a '(1 1 1 :a)))))

