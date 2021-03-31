package com.shun.day01

import scala.io.StdIn

/**
 * @Author: layman
 * @Date:Create：in 2021/3/30 18:30
 * @Description:
 */
object Input {
  def main(args: Array[String]): Unit = {
    /*val scanner = new Scanner(System.in)
    println(scanner.nextLine())*/

    //把标准输入流转换成字符流
    /*val reader = new BufferedReader(new InputStreamReader(System.in, "utf-8"))
    val line: String = reader.readLine()
    println(line)
    */

    val line: String = StdIn.readLine("请输入你的银行卡密码:")

    println(line)
  }
}

/*
从键盘输入数据:
    java:
        1. 高级写法, 在1.5之后支持
            val scanner = new Scanner(System.in)
            println(scanner.nextLine())
        
        2. 低级写法, 1.5之前使用
            val reader = new BufferedReader(new InputStreamReader(System.in, "utf-8"))
            val line: String = reader.readLine()
    
    scala:
    
        val line: String = StdIn.readLine("请输入你的银行卡密码:")
        println(line)

 */