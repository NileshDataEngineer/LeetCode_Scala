package com.scala.leetcode

object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
        val temp=x
        var sum=0
        var r=0
        var t=x
        var flag:Boolean=false
        while(t>0){
             r=t%10
             sum=(sum*10)+r
             t=t/10
        }
        if(sum==temp){
            flag=true
            
        }
        return flag
    }
  def main(args:Array[String]){
    print(isPalindrome(121))
    var a=121
    
  }
}


/*
 *  val temp=x
        var sum=0
        var r=0
        var t=x
        var flag:Boolean=false
        while(t>0){
             r=t%10
             sum=(sum*10)+r
             t=t/10
        }
        if(sum==temp){
            flag=true
            
        }
        return flag
    }
 */

