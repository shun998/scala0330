package com.shun

class MyApp {
    def myPrint(any: Traversable[_]): Unit = {
        println(any.mkString(", "))
    }
}
