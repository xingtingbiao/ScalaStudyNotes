package com.xingtb.course03

object TupleApp {

  // 元组: (......)
  def main(args: Array[String]): Unit = {
    val a = (1, 2, 3, 4)
    val value = a._1
    println(value)

    for (i <- 0 until a.productArity) {
      println(a.productElement(i))
    }

    val hostPort = ("localhost", 8080)
  }

}
