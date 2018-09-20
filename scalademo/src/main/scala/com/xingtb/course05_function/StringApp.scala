package com.xingtb.course05_function

object StringApp {

  def main(args: Array[String]): Unit = {
    val s = "Hello:"
    val name = "PK"
    // 插值
    println(s"Hello:$name")
    println(s"$s$name")

    // 多行 s"""""" 里面跟$
    val b =
      """
        |这是一个多行字符串
        |hello
        |world
        |PK
      """.stripMargin
    println(b)
  }

}
