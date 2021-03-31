package com.shun.day02.loop

/**
 * @Author: layman
 * @Date:Create：in 2021/3/31 8:57
 * @Description:
 */
object For5 {
    def main(args: Array[String]): Unit = {
        // 得到一个序列: 1 4 9 16 ... 100*100
        // for推导式
        /*val r = for (i <- 1 to 100) yield i * i
        println(r)*/
        
        // "abcd" => "AaBbCc"
        val s = for(c <- "abcd") yield c.toString.toUpperCase + c
        println(s.mkString(""))
        // 更加函数式
        println("abcd".map(c => c.toString.toUpperCase + c).mkString(""))
    }
}
