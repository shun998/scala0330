package com.shun.day06.pattern

/**
 * Author layman
 * Date 2021/3/9 16:08
 */
object OptionDemo1 {
    def main(args: Array[String]): Unit = {
        /*val op: Option[Int] = get
//        if (!op.isEmpty) {}
        if (op.isDefined) {
            println(op.get)
        }*/
        val op: Option[Double] = sqrt(-9)
        if (op.isDefined) {
            println(op.get)
        }else {
            println("没有平方根")
        }
    }
    
    def sqrt(n: Double) = {
        if(n >= 0) Some(math.sqrt(n))
        else None
    }
    
    def get :Option[Int] = None
    
    
}
/*
Option:
    java 的空指针异常
    
    
    
 */
