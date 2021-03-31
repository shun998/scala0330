package com.shun.day02.loop
/**
 * @Author: layman
 * @Date:Create：in 2021/3/31 8:57
 * @Description:
 */
object For4 {
    def main(args: Array[String]): Unit = {
        // 9*9乘法表
        /*for(i <- 1 to 9){
            for(j <- 1 to i){
                print(s"$j * $i = ${i * j}\t")
            }
            println()
        }*/
        // 所有的代码都在内循环, 则可以使用循环的嵌套
        // 实际情况使用很少
        for (i <- 1 to 9; j <- 1 to i) {
            print(s"$j * $i = ${i * j}\t")
            if (i == j) println()
        }
    }
}
