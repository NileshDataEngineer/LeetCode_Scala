package com.scala.leetcode
import scala.annotation.tailrec
object Valid_Perentheses_Recursion {
  def isBalanced(values: String): Boolean = {
  // If you would like to add or remove braces that need validation,
  // just change balanceMap
  val balanceMap = Map(
    ')' -> '(',
    '}' -> '{',
    ']' -> '['
  )
  val closedBraces = balanceMap.keys.toSeq
  val openBraces = balanceMap.values.toSeq

  @tailrec
  def isBalancedRec(parsed: Seq[Char], input: Seq[Char]): Boolean = {
    if (input.isEmpty) {
      if (parsed.isEmpty) {
        true
      } else {
        false
      }
    } else {
      input.head match {
        case in if openBraces.contains(in) =>
          isBalancedRec(in +: parsed, input.tail)
        case in if closedBraces.contains(in) =>
          if (parsed.isEmpty) {
            false
          } else if (parsed.head == balanceMap(in)) {
            isBalancedRec(parsed.tail, input.tail)
          } else {
            false
          }
        case _ => false
      }
    }
  }
  isBalancedRec(Nil, values.toCharArray)
}
  def main(args:Array[String]){
    println(isBalanced("(nilesh)"))
  }
}