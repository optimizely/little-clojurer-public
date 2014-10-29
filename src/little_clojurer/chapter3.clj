(ns little-clojurer.chapter3
  (:require [little-clojurer.chapter1 :refer :all])
  (:require [little-clojurer.chapter2 :refer :all]))

(defn rember
  "Return lst with the first instance of item removed."
  [item lst]
  nil)


(defn firsts
  "Takes a list of lists, return a list made out of first item of each sublist."
  [lst]
  nil)


(defn insertR
  "Return lst with new inserted to the right of the first occurrence of old."
  [new old lst]
  nil)


(defn insertL
  "Return lst with new inserted to the left of the first occurrence of old."
  [new old lst]
  nil)


(defn subst
  "Return lst with the first occurrence of old replaced by new."
  [new old lst]
  nil)


(defn subst2
  "Replace either the first occurrence of o1 or the first occurrence of o2 with new."
  [new o1 o2 lst]
  nil)


(defn multirember
  "Return lst with all occurrences of item removed."
  [a lst]
  nil)


(defn multiinsertR
  "Return lst with new inserted to the right of all occurrences of old."
  [new old lst]
  nil)


(defn multiinsertL
  "Return lst with new inserted to the left of all occurrences of old."
  [new old lst]
  nil)


(defn multisubst
  "Replace all occurrences of old with new."
  [new old lst]
  nil)
