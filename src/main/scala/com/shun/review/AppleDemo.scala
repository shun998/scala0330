package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/4/30 15:13
 * @Description:
 */
object AppleDemo {
  def main(args: Array[String]): Unit = {
    val a = new A
    a.foo()
    a(1)
    A()
  }

}

object A {
  def apply(): Unit = {
    println("object a")
  }

}

class A {
  def apply(i: Int): Unit = {
    println(i)
  }

  def foo(): Unit = {
    println("foo...")
  }

}
