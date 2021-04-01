package com.shun.day07.generic

/**
 * Author layman
 * Date 2021/3/10 11:46
 */
case class AA(val age: Int) extends Ordered[AA]{
    override def compare(that: AA): Int = age - that.age
}
object Generic2 {
    def main(args: Array[String]): Unit = {
        val aa = compare(new AA(10), new AA(20))
        
        println(aa)
        
    }
    
    def compare[T <: Ordered[T]](x: T, y: T):T = {
        if(x > y) x
        else y
    }
}
/*
泛型的界定

    泛型的上下界(上下限)
    
    上限
    
    上下文界定
    视图界定
    



下限
 */