package com.xingtb.course06_implicit

object ImplicitClassApp {

  def main(args: Array[String]): Unit = {
    // 只有int类型才有add方法, 因为implicit修饰的增强类的构造参数是Int类型: 即Calculator的x
    println(12.add(5))
    println(12 add 5)
  }

  implicit class Calculator(x: Int) {
    def add(a: Int): Int = a + x
  }

}
