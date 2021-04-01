package com.shun.day06.pattern

/**
 * Author layman
 * Date 2021/3/9 16:49
 */
case class User8(age: Int, var name: String)
object CaseDeo1 {
    def main(args: Array[String]): Unit = {
        val user: User8 = User8(10, "lisi")
        user match {
            case User8(age, name) => println(age)
        }
    }
}
/*
样例类:
    apply
    unapply
    equals
    hashCode
        ....
        
 封装数据:
  
  通讯协调
  
 */