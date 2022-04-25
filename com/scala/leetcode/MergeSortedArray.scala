package com.scala.leetcode

import scala.util.control.Breaks
import scala.util.control.BreakControl
import scala.util.control.Breaks._

object MergeSortedArray {
  def main(args: Array[String]) {
    val nums1 = Array(1, 2, 3, 0, 0, 0)
    val nums2 = Array(2, 5, 6)
    val m = 3
    val n = 3
    merge(nums1, m, nums2, n)
  }
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var x = 0
    var y = 0
    var k = 0
    for (i <- 0 to n - 1) {
      x = nums2(i) //2
      breakable {
        println("Here is x " + x)
        for (j <- 0 to m - 1) {
          println("Value of J " + j)
          println("Here is nums1 of J " + nums1(j))
          if (nums1(j) >= x) {

            y = nums1(j)
            nums1(j) = x
            nums1(j + 1) = y
            break
          }

        }
      }
    }
    for (a <- 0 to nums1.length - 1) {
      println(nums1(a))
    }
  }
}