package com.xingtb.course06_implicit

import java.io.File
import ImplicitAspect._

object ImplicitApp {

  def main(args: Array[String]): Unit = {
//    val man = new Man("XTB")
//    man.fly()

    val file = new File("test.txt")
    val str = file.read()
    println(str)
  }

//  /**
//    * 定义一个隐式转换函数即可
//    * 参数是普通对象, 返回牛逼对象, 代码块new 一个牛逼对象
//    */
//  implicit def manToSupper(man: Man): SuperMan = {new SuperMan(man.name)}
//
//  implicit def fileToRich(file: File): RichFile = new RichFile(file)

}

class Man(val name: String) {
  def eat(): Unit = {
    println(s"$name can eat...")
  }
}

class SuperMan(val name: String) {
  def fly(): Unit = {
    println(s"$name can fly...")
  }
}

class RichFile(val file: File) {
  def read(): String = {
    scala.io.Source.fromFile(file.getAbsolutePath).mkString
  }
}
