package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 20:16
 * @Description:
 */
object TypeMatch {
  def main(args: Array[String]): Unit = {
    /* val any:Any=10
     any match {
       case a:Int=>
       case b:String=>
       case arr:Array[Int]=>
       case list:List[_]=>
     }*/
    /*  val array: Array[Int] = Array(1, 2, 4)
      array match {
        case Array(a, b, _) => println(a)
      }*/
    val list = List(1, 2, 8, 4, 2)
    list match {
      case a :: b =>
        println(a)
        println(b)
    }
  }

}
