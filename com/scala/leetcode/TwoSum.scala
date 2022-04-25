/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
package com.scala.leetcode
import scala.util.control.Breaks._
object TwoSum {

  def twosum(nums: Array[Int], n: Int): Array[Int] = {
    var ary = new Array[Int](2)
    var lenght = nums.length - 1
    breakable {
      for (i <- 0 to lenght) {
        for (j <- i + 1 to lenght) {

          if ((nums(i) + nums(j)) == n) {

            ary(0) = i
            ary(1) = j
            break
          }
        }
      }
    }

    return ary
  }
  def main(args: Array[String]) {
    var ary = Array(3, 3)
    var n = 6

    var newary = twosum(ary, n)

    for (a <- newary) {
      print(a)
    }
  }
}