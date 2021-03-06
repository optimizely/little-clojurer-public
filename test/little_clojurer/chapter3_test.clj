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
    (is (= '(1 2 1 3) (insertR 1 2 '(1 2 3))))
    (is (= '(1 1 3) (insertR 1 2 '(1 1 3))))
    (is (= '(2 1 2 3) (insertR 1 2 '(2 2 3))))
    (is (= '() (insertR 1 2 '())))))


(deftest insertL-test
  (testing
    (is (= '(1 1 2 3) (insertL 1 2 '(1 2 3))))
    (is (= '(1 1 3) (insertL 1 2 '(1 1 3))))
    (is (= '(1 2 2 3) (insertL 1 2 '(2 2 3))))
    (is (= '() (insertL 1 2 '())))))


(deftest subst-test
  (testing
    (is (= '(:a :x :c) (subst :x :b '(:a :b :c))))
    (is (= '() (subst :x :b '())))
    (is (= '(:a :x :b :c :b) (subst :x :b '(:a :b :b :c :b))))))


(deftest subst2-test
  (testing
    (is (= '(:a :x :c) (subst2 :x :b :c '(:a :b :c))))
    (is (= '() (subst2 :x :b :c '())))
    (is (= '(:a :b :b :x :b) (subst2 :x :x :c '(:a :b :b :c :b))))
    (is (= '(:a :x :b :c :b) (subst2 :x :b :c '(:a :b :b :c :b))))))


(deftest multirember-test
  (testing
    (is (= '() (multirember :a '(:a :a :a :a :a))))
    (is (= '() (multirember :x '())))
    (is (= '(:a :b :c) (multirember :x '(:a :b :c))))
    (is (= '(:b :c :d) (multirember :a '(:a :b :a :c :a :a :d :a))))))


(deftest multiinsertR-test
  (testing
    (is (= '(1 2 1 3) (multiinsertR 1 2 '(1 2 3))))
    (is (= '(1 1 3) (multiinsertR 1 2 '(1 1 3))))
    (is (= '(2 1 2 1 3) (multiinsertR 1 2 '(2 2 3))))
    (is (= '() (multiinsertR 1 2 '())))))


(deftest multiinsertL-test
  (testing
    (is (= '(1 1 2 3) (multiinsertL 1 2 '(1 2 3))))
    (is (= '(1 1 3) (multiinsertL 1 2 '(1 1 3))))
    (is (= '(1 2 1 2 3) (multiinsertL 1 2 '(2 2 3))))
    (is (= '() (multiinsertL 1 2 '())))))


(deftest multisubst-test
  (testing
    (is (= '() (multisubst :new :old '())))
    (is (= '(:x :y :z) (multisubst :new :old '(:x :y :z))))
    (is (= '(:new :new :new :new) (multisubst :new :old '(:old :old :old :old))))
    (is (= '(:new :new :new :new) (multisubst :new :old '(:old :old :old :new))))
    (is (= '(:x :new :new) (multisubst :new :old '(:x :old :old))))))
