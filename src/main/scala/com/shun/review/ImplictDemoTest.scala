package com.shun.review

/**
 * @Author: layman
 * @Date:Create：in 2021/5/3 20:10
 * @Description:
 */
class ImplictDemoTest {
  implicit def double2Int(d: Double) = d.toInt
}
