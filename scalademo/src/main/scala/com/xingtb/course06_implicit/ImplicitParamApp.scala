package com.xingtb.course06_implicit

object ImplicitParamApp {

  def main(args: Array[String]): Unit = {
    implicit val test: String = "XTB"
    // implicit val two: String = "XTB" // 编译不通过
    sayName
    sayName("ZHANG")
  }



  def sayName(implicit name: String): Unit = {
    println(s"I am $name")
  }

}
