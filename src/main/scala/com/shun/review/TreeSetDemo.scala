package com.shun.review

import scala.collection.immutable.TreeSet

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 18:34
 * @Description:
 */
case class User1(age: Int, name: String)

object TreeSetDemo {
  def main(args: Array[String]): Unit = {
    //    val treeSet: TreeSet[Int] = TreeSet(7, 4, 9, 1)(Ordering.Int.reverse)
    implicit val ord: Ordering[User1] = new Ordering[User1]() {
      override def compare(x: User1, y: User1): Int = x.age - y.age
    }
    val treeSet: TreeSet[User1] = TreeSet(User1(10, "zhangsan"), User1(12, "lisi"), User1(18, "wangwu"))
    println(treeSet)
  }

}
