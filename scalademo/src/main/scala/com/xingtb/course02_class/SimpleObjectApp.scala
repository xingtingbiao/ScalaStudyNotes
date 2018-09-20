package com.xingtb.course02_class

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new People()
    println(person.name)
    person.name = "Messi"
    println(person.name + " .. " + person.age)
    println("invoke eat method: " + person.eat())
    person.watchFootball("Barcelona")
    person.printInfo()
  }

  class People {
    var name: String = _
    val age: Int = 20

    // []里面应该是指该私有属性属性的作用域范围
    private [course02_class] val gender: String = "male"

    def printInfo(): Unit = {
      println("gender: " + gender)
    }

    def eat(): String = {
      name + "eating..."
    }

    def watchFootball(teamName: String): Unit = {
      println(name + "is watching match of " + teamName)
    }

  }

}
