package com.shun.a

import java.util

import scala.collection.mutable.ArrayBuffer

/**
 * @Author: layman
 * @Date:Create：in 2021/4/2 9:38
 * @Description:
 */
object Demo1 {
  def main(args: Array[String]): Unit = {
    val buffer = ArrayBuffer(1, 2, 3, 4)
    val buffer2 = ArrayBuffer.apply(1, 2, 3)
    val buffer3 = buffer2 :+ 10
    buffer3 += 10
    1000 +=: buffer
    println(buffer)
    println(buffer2)
    println(buffer3)
  }

}
