package com.xingtb.course02

object ConstructorApp {

  def main(args: Array[String]): Unit = {
//    val person = new Person("xingtb", 20)
//    println(person.name + ": " + person.age + ": " + person.school)
//
//    val person2 = new Person("tom", 18, "male")
//    println(person2.name + ": " + person2.age + ": " + person2.school + ":　" + person2.gender)

    val student = new Student("xtb", 18, "Math")
    println(student.name + ": " + student.age + ": " + student.major)
    println(student)
  }

  // 主构造器
  class Person(val name: String, val age: Int) {
    println("Person constructor enter...")
    val school = "ustc"
    var gender: String = _

    // 附属构造器
    def this(name: String, age: Int, gender: String) {
      this(name, age) //附属构造器的第一行必须调用主构造器或者其他附属构造器
      this.gender = gender
    }

    println("person constructor leave...")
  }

  class Student(name: String, age: Int, var major: String) extends Person(name, age) {
    println("Student constructor enter...")
    override val school: String = "peking"
    override def toString: String = "Student override def toString"

    println("Student constructor leave...")
  }

}
