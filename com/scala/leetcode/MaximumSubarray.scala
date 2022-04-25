package com.scala.leetcode

import scala.util.control.Breaks

object MaximumSubarray {
  def main(args: Array[String]) {
     val intArray = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
   // val intArray = Array(1)
    println(maxSubArray(intArray))
    
  }
  def maxSubArray(num: Array[Int]): Int = {
    var max_start = Integer.MIN_VALUE
    var max_end = 0

    for (i <- 0 to num.length - 1) {
      max_end = max_end + num(i)

      if (max_start < max_end) {
        max_start = max_end
      }

      if (max_end < 0) {
        max_end = 0
      }

    }

    return max_start

  }
}