package com.xingtb.course02_class

object AbstractApp {

  def main(args: Array[String]): Unit = {
    val cat = new Cat()
    cat.speak()
  }

  /**
    * 类的一个或者多个方法没有完整的实现 (只有定义, 没有实现)
    */
  abstract class Animal {
    var name: String
    var age: Int
    def speak()
  }

  class Cat extends Animal {
    override var name: String = _
    override var age: Int = _

    override def speak(): Unit = println("hello world!")
  }

}
