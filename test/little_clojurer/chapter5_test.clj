(ns little-clojurer.chapter5_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter5 :refer :all]))

(deftest rember*-test
  (testing
    (is (= '() (rember* :x '())))
    (is (= '() (rember* :x '(:x))))
    (is (= '(()) (rember* :x '(:x (:x) :x))))
    (is (= '((() :y)) (rember* :x '(:x ((:x) :y) :x))))
    (is (= '((() :y) (:z :z (:z))) (rember* :x '(:x ((:x) :y) :x (:z :z (:z :x))))))
    (is (= '(()) (rember* :x '(()))))
  ))

(deftest insertR*-test
  (testing
    (is (= '() (insertR* :new :old '())))
    (is (= '(:old :new) (insertR* :new :old '(:old))))
    (is (= '((:old :new)) (insertR* :new :old '((:old)))))
    (is (= '((:old :new) :new (:old :new)) (insertR* :new :old '((:old) :new (:old)))))
    (is (= '((:old :new) :new (:old :new)) (insertR* :new :old '((:old) :new (:old)))))
    (is (= '((:old :new) :new () (:old :new)) (insertR* :new :old '((:old) :new () (:old)))))
  ))

(deftest occur*-test
  (testing
    (is (= 0 (occur* :a '())))
    (is (= 0 (occur* :a '((())))))
    (is (= 0 (occur* :a '((:b ()) :b))))
    (is (= 1 (occur* :a '((:b (:a)) :b))))
    (is (= 3 (occur* :a '((:a (:a)) :a :b))))
    (is (= 3 (occur* :a '(() (:a (:a)) :a :b))))
  ))

(deftest subst*-test
  (testing
    (is (= '() (subst* :new :old '())))
    (is (= '(:new) (subst* :new :old '(:old))))
    (is (= '((:new)) (subst* :new :old '((:old)))))
    (is (= '((:new) :new (:new)) (subst* :new :old '((:old) :new (:old)))))
    (is (= '((:new) :new ( :new)) (subst* :new :old '((:old) :new (:old)))))
    (is (= '((:new) :new () (:new)) (subst* :new :old '((:old) :new () (:old)))))
  ))

(deftest member*-test
  (testing
    (is (= false (member* :a '())))
    (is (= false (member* :a '((())))))
    (is (= false (member* :a '((:b ()) :b))))
    (is (= true (member* :a '((:b (:a)) :b))))
    (is (= true (member* :a '((:a (:a)) :a :b))))
    (is (= true (member* :a '(() ((:a)) :a :b))))
  ))

(deftest leftmost-test
  (testing
    (is (= :a (leftmost '(:a))))
    (is (= :a (leftmost '(:a :b :c :d))))
    (is (= :a (leftmost '((((:a))) (:b) :c :d))))
  ))

(deftest bonus-test
  (testing
    (is (= [3 2 1] ((bonus rest reverse) [1 2 3 4])))
    (is (= 5 ((bonus (partial + 3) second) [1 2 3 4])))
    (is (= true ((bonus zero? #(mod % 8) +) 3 5 7 9)))
    (is (= "HELLO" ((bonus #(.toUpperCase %) #(apply str %) take) 5 "hello world")))
  ))
