package com.scala.leetcode

object ArrayContain_Duplicate_Set {
  def main(args:Array[String]){
    var nums=Array(1,2,3,4,5,6,6)
    println(containsDuplicate(nums))
  }
  def containsDuplicate(nums:Array[Int]):Boolean = {
    val arysize=nums.length
    
    val set=nums.toSet
    val setsize=set.size
   
    if(arysize==setsize){
      return false
    }
    else {
      return true
    }
  }
}