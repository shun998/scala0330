package com.shun.day01
/**
 * @Author: layman
 * @Date:Create：in 2021/3/30 18:30
 * @Description:
 */
object String_2 {
    def main(args: Array[String]): Unit = {
        /*val s =
            """你阿法拉圣诞节疯狂拉萨的
爱上了房间爱死了附近
精灵盛典荆防颗粒
               
aaaa
               aq
              """*/
        /*val s =
            """
              |afaf
              |aaa
              |bb
              |ccc
              |""".stripMargin*/
        val date = "2021-03-02"
        val s =
        s"""
          |select
          | *
          |from user
          |where date='$date'
          |""".stripMargin
        println(s)
    }
}

/*
多行字符串:
    """
    
    """
 


 */
