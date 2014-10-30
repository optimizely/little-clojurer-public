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


(deftest firsts-test
  (testing
    (is (= '(1 2 3 4) (firsts '((1 2) (2 3) (3 4) (4 5)))))
    (is (= '() (firsts '())))
    (is (= '(()) (firsts '((())))))))


(deftest insertR-test
  (testing
    (is true)))


(deftest insertL-test
  (testing
    (is true)))


(deftest subst-test
  (testing
    (is true)))


(deftest subst2-test
  (testing
    (is true)))


(deftest multirember-test
  (testing
    (is true)))


(deftest multiinsertR-test
  (testing
    (is true)))


(deftest multiinsertL-test
  (testing
    (is true)))


(deftest multisubst-test
  (testing
    (is true)))
