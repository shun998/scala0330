package com.shun.day04.more

/**
 * Author layman
 * Date 2021/3/6 11:48
 */
object MyApp extends App {
    util.Properties.scalaPropOrNone("scala.time")
    println("aaa")
    foo()
    def foo() = {
        println("aaa")
    }
}
