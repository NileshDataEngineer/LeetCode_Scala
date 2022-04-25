package com.scala.leetcode

object MaximumSubArray_Two {
  def main(args:Array[String]){
   // var nums=Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val nums=Array(-1)
    println(maxSubArray(nums))
    println(maxSubArray_two(nums))
  }
  def maxSubArray(nums:Array[Int]):Int={
    var maxSum=0
    var sum=0
    for(i <- 0 to nums.length-1){
      sum=0
      for(j <- i to nums.length-1){
        sum=sum+nums(j)
        maxSum=Math.max(maxSum, sum)        
      }
    }
    return maxSum
  }
  def maxSubArray_two(nums:Array[Int]):Int={
    var currentMax=nums(0)
    var maxsoFar=nums(0)
    for(i <- 0 to nums.length-1){
     currentMax=Math.max(nums(i), currentMax + nums(i))
     maxsoFar=Math.max(maxsoFar, currentMax)
    }
    return maxsoFar
  }
}