package com.xingtb.course01

object FunctionApp {

  def main(args: Array[String]): Unit = {
//    println(add(2, 3))
//    println(there) // 没有入参的函数, 调用的时候括号()可以省略
//    sayHello()
//    sayHello
//    sayName("PK")
//    println(speed(100, 10))
//    println(speed(time = 10, distance = 100)) //可变参数写法
//    println(sum(1, 2, 3, 4))
    testFor()
  }

  def add(x: Int, y: Int): Int = {
    x + y
  }

  def there() = 1 + 2

  def sayHello(): Unit = {
    println("Say Hello...")
  }

  def sayName(name: String = "xingtb"): Unit = {
    println(name)
  }

  def speed(distance: Float, time: Float): Float = {
    distance/time
  }

  def sum(number: Int*): Int = {
    var sum = 0
    for (n <- number) {
      sum += n
    }
    sum
  }

  def testFor(): Unit = {
    for (i <- 1 until 10 if i % 2 == 0) {
      println(i)
    }

    val array = Array("abc", "def", "ghi")
    array.foreach(println)
  }

}
