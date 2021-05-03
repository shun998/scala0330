package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 20:23
 * @Description:
 */
object Sqrt {
  def unapply(n: Double) = if (n >= 0) Some(math.sqrt(n)) else None
}

object ObjMatch {
  def main(args: Array[String]): Unit = {
  /*  val i: Double = -9
    i match {
      //调用unapply方法
      case Sqrt(a) => println(a)
      case _ => println("无平方根")
    }*/
    val aa: AA = AA(10, "zs")
    aa match {
      case AA(a, b) => println(a)
      case _ =>
    }
  }

}

case class AA(a: Int, b: String)
