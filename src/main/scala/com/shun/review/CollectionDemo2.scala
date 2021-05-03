package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/4/30 15:37
 * @Description:
 */
object CollectionDemo2 {
  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 1, 7, 9)
    println(list.head) //头
    println(list.last) //尾
    println(list.tail) //去头
    println(list.init) //去尾
    println(list.take(3)) //取前三个
    println(list.drop(3)) //删前三个,剩下的
    println(list.takeRight(2)) //取右边两个
    println(list.dropRight(2)) //删右边两个,剩下的
  }

}
