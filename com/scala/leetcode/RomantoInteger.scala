package com.scala.leetcode

object RomantoInteger {
  def romanToInt(s: String): Int = {

    val map = Map("I" -> 1, "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000)
    
    var n = s.length()
    var num = map(s.charAt(n - 1).toString())

    for (a <- n - 2 to 0 by -1) {

      if (a < s.length() - 1 && map(s.charAt(a).toString()) >= map(s.charAt(a + 1).toString())) {
println(map(s.charAt(a).toString()) +" Here is check "+  map(s.charAt(a + 1).toString()) )
        num += map(s.charAt(a).toString())
      } else {

        num -= map(s.charAt(a).toString())
      }
    }
    return num
  }

  def main(args: Array[String]) {
    println(romanToInt("MCMXCIV"))
  }
}