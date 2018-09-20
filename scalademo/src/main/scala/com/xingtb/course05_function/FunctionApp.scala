package com.xingtb.course05_function

/**
  * 匿名函数: 函数可命名, 也可以不命名
  * (参数名: 参数类型...) => 函数体   (返回值就是函数体的返回值, 类型亦是)
  */
object FunctionApp extends App {
  /**
    * 匿名函数可以付给变量常量, 也可以付给函数定义
    */
  val f = (x: Int, y: Int) => x + y
  def f2 = (x: Int, y: Int) => x * y

  /**
    * curry函数---柯里化函数
    * 将原来需要传递N个参数的函数, 拆分成多次传入, 即多个()
    */
  def sum(a:Int, b: Int) = a + b
  println(sum(1, 2))
  def sum2(a: Int)(b: Int) = a + b
  println(sum2(2)(3))

}
