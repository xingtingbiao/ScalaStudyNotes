package com.xingtb.course04_match

import scala.util.Random

object MatchApp {

  def main(args: Array[String]): Unit = {
//    val weeks = Array("Monday", "Tuesday", "Wednesday", "Thursday")
//    val week = weeks(Random.nextInt(weeks.length))
//
//    week match {
//      case "Monday" => println("今天是周一")
//      case "Tuesday" => println("今天是周二")
//      case "Wednesday" => println("今天是周三")
//      case _ => println("我也不知道今天是周几")
//    }
//
//    judgeGrade("lisi", "D")
//    greeting(List("zhangsan", "lisi", "tom"))
    matchType(Map(1 -> "a"))
    caseClassMatch(Employee("xtb", "10"))
    getGrade("lsi")
    getGrade("XTB")
  }

  /**
    * 基本数值 模式匹配
    * @param grade
    */
  def judgeGrade(grade: String): Unit = {
    grade match {
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ => println("need work harder...")
    }
  }

  /**
    * 基本数值 模式匹配 (匹配中加过滤条件)
    * @param grade
    */
  def judgeGrade(name: String, grade: String): Unit = {
    grade match {
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ if name == "lisi" => println("you are good boy, but....")
      case _ => println("need work harder...")
    }
  }

  /**
    * Array 模式匹配
   */
  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("zhangsan") => println("Hi, zhangsan!")
      case Array(x, y) => println("Hi: " + x + ", " + y) //匹配两个人的
      case Array("zhangsan", _*) => println("Hi, zhangsan and other friends!")
      case _ => println("Hi, everybody!")
    }
  }

  /**
    * List 模式匹配
    */
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
  def matchType(obj: Any): Unit = {
    obj match {
      case _: Int => println("Int")
      case _: String => println("String")
      case m: Map[_, _] => m.foreach(println)
      case _ => println("other type")
    }
  }

  /**
    * case class 模式匹配
    */
  class Person // 作为传参的时候的一个通用类, 才能进行具体匹配
  case class CEO(name: String, floor: String) extends Person
  case class Employee(name: String, floor: String) extends Person
  case class Other(name: String) extends Person

  def caseClassMatch(p: Person): Unit = {
    p match {
      case CEO(name, floor) => println("CEO name: " + name + " floor: " + floor)
      case Employee(name, floor) => println("Employee name: " + name + " floor: " + floor)
      case _ => println("Others...")
    }
  }

  /**
    * Some&None 模式匹配
    */
  val grades = Map("XTB" -> "A", "ZHANGSAN" -> "C")
  def getGrade(name: String): Unit = {
    val grade = grades.get(name)
    grade match {
      case Some(x) => println(name + " grade is: " + x)
      case None => println("none")
    }
  }
}
