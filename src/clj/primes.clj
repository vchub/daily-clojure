(ns clj.primes
  (:require [clojure.test :refer :all]))

(testing
 (is (= 2 3)))

(comment
  (let [n (biginteger 2013)]
    (prn (.isProbablePrime n 5))
    (prn (.nextProbablePrime n ))

  )
