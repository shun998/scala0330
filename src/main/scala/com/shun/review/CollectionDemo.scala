package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/4/30 15:37
 * @Description:
 */
object CollectionDemo {
  def main(args: Array[String]): Unit = {
    //    val list: List[Int] = List[Int]()//空集合//List[Int].apply()
    //    val list: Nil.type = Nil//空集合
    //    val strings: Set[String] = Set[String]()//Set[String].apply()
    //    val list: List[Int] = List[Int](10, 20)
    //    val list2 = 100 :: list ::: list
    //    println(list2)
    val map: Map[Int, Int] = Map(1 -> 10, 1 -> 20)
    println(map(1))
    //    println(map(2))
    println(map.get(1))
    println(map.get(2))
    map.get(2) match {
      case Some(x) => println(x)
      case None =>
        println("none..")
    }
    map.get(1) match {
      case Some(x) => println(x)
      case None =>
        println("none..")
    }
    map.getOrElse(1, 2)
  }

}
