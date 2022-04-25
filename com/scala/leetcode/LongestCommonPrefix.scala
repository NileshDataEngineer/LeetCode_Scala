package com.scala.leetcode
import scala.util.control.Breaks._
object LongestCommonPrefix {
  def CommonPrefix(ary: Array[String]): String =
    {
      var size = ary.length
      var str = ""
      println("Array Size " + ary.length)
      if (ary.isEmpty) {

        return str
      } else if (ary.length == 1) {

        return ary(0)
      } else {
        for (a <- 0 to size - 1) {
          println("At Line 17")
          breakable {
            for (i <- 0 to ary(a).length() - 1) {
              println("At Line 20")
              var c = ary(a).substring(0, i + 1)

              var count = 0
              for (j <- 1 to size - 1) {
                println("At Line 25")
                if (ary(j).length()  > i ) {
                  println("Line 27")
                  var d = ary(j).substring(0, i + 1)
println("Here D is "+d)
                  if (c.equals(d)) {
                    count += 1
println("Count "+count)
                  }
                }

              }
              if (count >= 1) {
                str = c

              } else {
                break
              }
            }
          }
        }
        return str
      }
    }
  def main(args: Array[String]) {
    var ary = Array("a","a a")//("Nileshshinde", "Swati", "Nilesh", "Nilaesh", "Nildela", "Ninu")
  //var ary = Array("Swati", "Nileshshinde", "Nilesh", "Nilaesh", "Nildela", "Ninu")

    print("Final " + CommonPrefix(ary))
  }
}
