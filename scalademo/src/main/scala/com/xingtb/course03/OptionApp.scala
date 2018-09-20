package com.xingtb.course03

object OptionApp {

  def main(args: Array[String]): Unit = {
    val m = Map(1 -> 2)
    println(m(1))
    println(m.getOrElse(2, "None"))
  }

}
