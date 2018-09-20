package com.xingtb.course04

import scala.util.Random

object MatchApp {

  def main(args: Array[String]): Unit = {
    val weeks = Array("Monday", "Tuesday", "Wednesday", "Thursday")
    val week = weeks(Random.nextInt(weeks.length))

    week match {
      case "Monday" => println("今天是周一")
      case "Tuesday" => println("今天是周二")
      case "Wednesday" => println("今天是周三")
      case _ => println("我也不知道今天是周几")
    }

    judgeGrade("lisi", "D")
    greeting(List("zhangsan", "lisi", "tom"))
  }

  def judgeGrade(grade: String): Unit = {
    grade match {
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ => println("need work harder...")
    }
  }

  def judgeGrade(name: String, grade: String): Unit = {
    grade match {
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ if name == "lisi" => println("you are good boy, but....")
      case _ => println("need work harder...")
    }
  }

  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("zhangsan") => println("Hi, zhangsan!")
      case Array(x, y) => println("Hi: " + x + ", " + y) //匹配两个人的
      case Array("zhangsan", _*) => println("Hi, zhangsan and other friends!")
      case _ => println("Hi, everybody!")
    }
  }

  def greeting(list: List[String]): Unit = {
    list match {
      case "zhangsan"::Nil => println("Hi, zhangsan!")
      case x::y::Nil => println("Hi: " + x + ", " + y) //匹配两个人的
      case "zhangsan":: _ => println("Hi, zhangsan and other friends!")
      case _ => println("Hi, everybody!")
    }
  }

  /**
    * 类型匹配
    */

}
