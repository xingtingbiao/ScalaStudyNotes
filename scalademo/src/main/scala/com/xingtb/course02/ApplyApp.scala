package com.xingtb.course02

object ApplyApp {

  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 10) {
//      ApplyTest.add()
//    }
//    println(ApplyTest.count) // 10 说明object本身就是一个单例对象
    val b = ApplyTest() //object.apply -->不加()就是伴生对象本身, 加了()相当于伴生对象调用了apply()方法; 等同于 ApplyTest.apply()
    println(b)
    println("------------------------------------------------")
    val c = new ApplyTest
    println(c)
    c() //class.apply, 但是需要实例化之后才能使用()调用apply()
  }
}

/**
  * 他们两互为伴生
  */
// 伴生类
class ApplyTest {
  def apply() = {
    println("class ApplyTest apply...")
  }
}

// 伴生对象
object ApplyTest {
  println("object ApplyTest enter...")
  var count = 0
  def add(): Unit = {
    count = count + 1
  }

  /**
    *最佳实践: 在object中的apply方法中new Class
    * apply()方法可带参数
    */
  // object 中的apply
  def apply(): ApplyTest = {
    println("object ApplyTest apply...")
    new ApplyTest
  }
  
  println("object ApplyTest leave...")
}
