package com.shun.day05.arr

import scala.collection.mutable.ArrayBuffer

/**
 * Author layman
 * Date 2021/3/7 9:25
 */
object Array3 {
    def main(args: Array[String]): Unit = {
//        val arr1 = Array(30, 50, 70, 60, 10, 20)
//        val buffer: mutable.Buffer[Int] = arr1.toBuffer
//        println(buffer)
    
        val b: ArrayBuffer[Int] = ArrayBuffer(10, 20)
        println(b.toArray.mkString(","))
    }
}
