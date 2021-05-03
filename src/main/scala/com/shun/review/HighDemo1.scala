package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 18:59
 * @Description:
 */
object HighDemo1 {
  def main(args: Array[String]): Unit = {
    val list = List("aaa", "abc", "ccc")
    println(list.map(x => x))
    println(list.flatten) //集合中的元素为集合
    val list1 = List(1, 7, 9, 4, 2)
    val list2: List[List[Int]] = list1.map(x => List(x, x * x, x * x * x))
    println(list2.flatten)
    println(list1.flatMap(x => List(x, x * x, x * x * x)))
  }
}
