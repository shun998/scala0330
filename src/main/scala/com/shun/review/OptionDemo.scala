package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 19:41
 * @Description:
 */
object OptionDemo {
  def main(args: Array[String]): Unit = {
    /*  val opt1: Option[Int] = Some(10)
      val opt2: Option[Int] = None
      val option: Option[Int] = opt2 match {
        case Some(x) => Some(x * x)
        case None =>
          None
      }
      println(option)*/
    val array = List(Some(1), None, Some(5))
    //    val array1 = array.filter(_ != None).map(_.get)
    val array1 = array.filter(_.isDefined).map(_.get)
    val list: List[Int] = array.collect {
      case Some(x) => x
    }
    println(list)
  }

}
