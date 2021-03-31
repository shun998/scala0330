package com.shun.day02.loop

/**
 * @Author: layman
 * @Date:Create：in 2021/3/31 8:57
 * @Description:
 */
object WhileDemo1 {
    def main(args: Array[String]): Unit = {
        var i = 0
        val r = while (i < 10) {
            println(i)
            i += 1
            i
        }
        println(r)
    }
}
