package com.scala.leetcode

object ArrayContain_Duplicate {
  def main(args: Array[String]) {
    var nums = Array(1, 1,2, 3, 4, 5, 6)
    println(containsDuplicate(nums))
  }
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val size = nums.length -1
    for (a <- 0 to size) {

      for (b <- a+1  to size ) {
        if (nums(a) == nums(b)) {
          return true
        }

      }

    }
    return false
  }
}