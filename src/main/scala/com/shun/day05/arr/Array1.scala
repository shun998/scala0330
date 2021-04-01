package com.shun.day05.arr

import com.shun.MyApp

/**
 * Author layman
 * Date 2021/3/7 8:20
 */
object Array1 extends MyApp{
    def main(args: Array[String]): Unit = {
        // 创建长度为10的int数组 等价于java:  new Int[10]
        val arr = new Array[Int](10)
        myPrint(arr)
    }
}
/*
定长数组的创建:
    1. 通过元素直接初始化数组
        val arr = Array[Int](1,2,3)
    2. 创建的时候指定数组长度
        new Array[Int](10)
 */

