package com.shun.review

import com.alibaba.fastjson.JSON
import org.json4s.jackson.Serialization

import scala.beans.BeanProperty

/**
 * @Author: layman
 * @Date:Create：in 2021/4/30 14:40
 * @Description:
 */
object ObjectDemo2 {
  def main(args: Array[String]): Unit = {
    val person = new Person(11, "zs")
    //    java的序列化
    //    println(JSON.toJSONString(person, true))
    import org.json4s.DefaultFormats
    val r = Serialization.write(person)(DefaultFormats)
    println(r)
  }


}

//class Person(@BeanProperty val age: Int, @BeanProperty var name: String)
class Person(val age: Int, var name: String)