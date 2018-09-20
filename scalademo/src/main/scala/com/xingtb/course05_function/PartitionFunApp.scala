package com.xingtb.course05_function

import scala.util.Random

/**
  * 偏函数: 被包在花括号内没有match的一组case语句
  */
object PartitionFunApp {

  def main(args: Array[String]): Unit = {

    val weeks = Array("Monday", "Tuesday", "Wednesday", "Thursday")
    val week = weeks(Random.nextInt(weeks.length))
    println(getChineseWeek(week))

//    week match {
//      case "Monday" => println("今天是周一")
//      case "Tuesday" => println("今天是周二")
//      case "Wednesday" => println("今天是周三")
//      case _ => println("我也不知道今天是周几")
//    }
  }

  // PartialFunction[A, B]  A 输入参数类型,  B 输出参数类型
  def getChineseWeek:PartialFunction[String, String] = {
    case "Monday" => "今天是周一"
    case "Tuesday" => "今天是周二"
    case "Wednesday" => "今天是周三"
    case _ => "我也不知道今天是周几"
  }

}
