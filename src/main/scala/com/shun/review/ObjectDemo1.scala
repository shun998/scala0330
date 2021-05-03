package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/4/30 14:40
 * @Description:
 */
object ObjectDemo1 {
  def main(args: Array[String]): Unit = {
    val user: User = new User(11, "shun", "male")
    println(user.name)
    println(user.age)

  }

}

class User(val age: Int, var name: String, sex: String) {
  println("主构造")

  def this() {
    this(10, "layman", "female")
  }

  def this(a: Int) {
    this()
    println(a)
  }

  def foo(): Unit = {
    println(name)
    println(this.age)
    println(this.name)
    println(this.sex)
  }
}
