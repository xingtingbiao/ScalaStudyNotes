package com.xingtb.course04_match

object ExceptionApp {

  def main(args: Array[String]): Unit = {
    val file = "test.txt"
    try {
      // open file
      // use file
      val i = 10/0
      println(i)
    } catch {
      case e: ArithmeticException => println(e.getCause + e.getMessage)
      case e: Exception => println(e.getMessage)
    } finally {
      // 释放资源, 一定可执行的区域
      //close file
    }
  }

}
