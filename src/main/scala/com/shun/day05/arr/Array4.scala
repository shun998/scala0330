package com.shun.day05.arr

/**
 * Author layman
 * Date 2021/3/7 9:27
 */
object Array4 {
    def main(args: Array[String]): Unit = {
        // 多维数组  (二维数组), 假的, 用一维数组模拟的多维数组
        // 2 * 3的
        val arr: Array[Array[Int]] = Array.ofDim[Int](2, 3)
//        println(arr(0)(1))
        for (a1 <- arr) {
            for (elem <- a1) {
                println(elem)
            }
        }
    }
}
