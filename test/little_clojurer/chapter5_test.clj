(ns little-clojurer.chapter5_test
  (:require [clojure.test :refer :all]
            [little-clojurer.chapter5 :refer :all]))

(deftest rember*-test
  (testing
    (is (= '() (rember* :x '())))
    (is (= '(()) (rember* :x '(:x (:x) :x))))
    (is (= '((() :y)) (rember* :x '(:x ((:x) :y) :x))))
    (is (= '((() :y) (:z :z (:z))) (rember* :x '(:x ((:x) :y) :x (:z :z (:z :x))))))
    (is (= '(()) (rember* :x '(()))))))
