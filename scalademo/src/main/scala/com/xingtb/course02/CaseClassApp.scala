package com.xingtb.course02

// case class 通常用在模式匹配上
object CaseClassApp {

  def main(args: Array[String]): Unit = {
    println(Dog("tom").name)
  }

  // case class不用new
  case class Dog(name: String)
}
