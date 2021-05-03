package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 20:05
 * @Description:
 */

object ImplictDemo {

  def main(args: Array[String]): Unit = {
    val demoTest = new ImplictDemoTest
    import demoTest._
    val a: Int = 1.1
    println(a)
  }

}
