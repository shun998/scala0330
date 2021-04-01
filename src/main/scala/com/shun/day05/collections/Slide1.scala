package com.shun.day05.collections

/**
 * Author layman
 * Date 2021/3/7 14:07
 */
object Slide1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        // 滑窗
        val it: Iterator[List[Int]] = list1.sliding(3, 2)
        for (e <- it) {
            println(e)
        }
    }
}
