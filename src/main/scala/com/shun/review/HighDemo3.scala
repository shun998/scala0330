package com.shun.review

import scala.collection.immutable

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 18:59
 * @Description: 偏函数,使用collect
 */
object HighDemo3 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 9, 3, 5, 7, "a", "b", 12.5, false, 2)
    /*val list1: List[Int] = list.collect {
      case a: Int => a * a//这里使用了模式匹配的语法,不属于模式匹配
    }
    println(list1)*/
    val f: PartialFunction[Any, Int] = new PartialFunction[Any, Int] {
      //      偏函数,当返回值为true的时候才会交给apply进行处理
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = {
        val x: Int = v1.asInstanceOf[Int]
        x * x
      }
    }
    println(list.collect(f))
  }
}
