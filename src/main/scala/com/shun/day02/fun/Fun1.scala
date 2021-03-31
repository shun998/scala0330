package com.shun.day02.fun

/**
 * @Author: layman
 * @Date:Create：in 2021/3/31 8:57
 * @Description:
 */
object Fun1 {
    def main(args: Array[String]): Unit = {

    }
}
/*
面向过程编程:
    C
        结构体

面向对象编程:
    C++
    java
    对象
        属性和方法
    对象?
        解决数据和行为的封装问题
        是数据和行为的集合

函数式编程:
    更加类似面向过程编程
    
    所有的东西都可以看成数据, 函数其实也是一种数据
    函数式一等公民
    
    在科学领域解决数据的运算比较方便, 在工程领域并不是太适合
    
    scala 是结合函数式和面向对象的所有优点于一体
    
    scala 可以面向对象风格, 也可以面向函数风格, 但是大部分情况都是二者结合起来
    
函数式编程:
    1. 纯函数
        一个函数只做自己该做的事情, 没有其他的任何的副作用
        def add(a:Int,b:Int) = { a + b }  // 纯函数
        def add(a:Int,b:Int) = {println("abc"); a + b } // 不是纯韩数
        val c = 10
        def add(a:Int,b:Int) = { a + b + c } // 不是纯韩数
        1. 引用透明
        2. 没有副作用
            常见的副作用
                1. 输出
                2. 写文件到磁盘, 数据等外部存储
                3. 更改了外部的变量的值
                
       过程:
        只有副作用, 没有返回值(Unit)
       
    2. 闭包
    3. 柯里化
    4. 高阶函数
            ...
*/