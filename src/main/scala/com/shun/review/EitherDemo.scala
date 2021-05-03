package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 19:53
 * @Description:
 */
object EitherDemo {
  def main(args: Array[String]): Unit = {
    //    either 结果有两种可能
    val e1: Either[Int, String] = Left[Int, String](100)
    val e2: Either[Int, String] = Right[Int, String]("scala")
    /*if (e1.isLeft) {
      println(e1.left.get)
    }*/
    e1 match {
      case Left(v) => println("left: " + v)
      case Right(v) => println("right: " + v)
    }
  }
}
