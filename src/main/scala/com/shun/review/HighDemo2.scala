package com.shun.review

import scala.collection.immutable

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 18:59
 * @Description:
 */
object HighDemo2 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 10, "b" -> 20, "c" -> 30)
    val map2 = Map("a" -> 100, "c" -> 300, "d" -> 400)
    /* var result = map1
     for ((k, v) <- map2) {
       val i: Int = result.getOrElse(k, 0)
       result += k -> (v + i)
     }
     println(result)*/
    val map3: Map[String, Int] = map1.foldLeft(map2) {
      case (map, (k, v)) =>
        map + (k -> (v + map.getOrElse(k, 0)))
    }
    val list4: immutable.Iterable[Map[String, Int]] = map1.scanLeft(map2) {
      case (map, (k, v)) =>
        map + (k -> (v + map.getOrElse(k, 0)))
    }
    println(list4)
  }
}
