package com.scala.leetcode

import scala.collection.mutable._
import scala.util.control.Breaks._
object Valid_Parentheses {
  def isValid(s: String): Boolean = {
    var test = true
    var stack = Stack[String]()
    breakable {
      for (a <- 0 to s.length() - 1) {
        var char = s.charAt(a)
        if (char == '(' || char == '{' || char == '[') {
          stack.push(char.toString())
        }

        if (stack.isEmpty) {
          test = false
          break
        }

        if (char == ')' || char == '}' || char == ']') {
          var c: String = ""
          char match {
            case ')' =>
              c = stack.pop()
              if (c == "{" || c == "[") {
                test = false
              }
            case ']' =>
              c = stack.pop()

              if (c == "(" || c == "{") {
                test = false
              }
            case '}' =>
              c = stack.pop()
              if (c == "(" || c == "[") {
                test = false
              }
          }

        }

      }
    }
    if (!stack.isEmpty) {
      test = false
    }

    return test
  }
  def main(args: Array[String]) {
    println(isValid("()"))
    println(isValid("(}"))
    println(isValid("[]}"))
    println(isValid("(Scala developer)"))
  }
}

 