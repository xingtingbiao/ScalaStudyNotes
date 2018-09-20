package com.xingtb.course03_collection

import scala.collection.mutable._
import scala.collection.mutable

object MapApp {

  def main(args: Array[String]): Unit = {
    val map = Map("PK" -> 18, "Tom" -> 20)

    val b = mutable.Map("PK" -> 18, "Tom" -> 20)
    // b("lISI") // 这种形式, 没有元素会报错
    val d = b.get("lISI") //这种形式不会报错, 没有元素返回空值
    // val value = d.get
    b.getOrElse("PK", 0) //拿到就是, 拿不到就用默认
    println(d)
    println(b)

    b += ("lisi" -> 20)
    b ++= Map("ZHANG" -> 9)
    val c = mutable.HashMap[String, Int]()
    println(c)

    for ((key, value) <- b) {
      println(key + ": " + value)
    }

    for ((key, _) <- b) {
      println(key + ": " + b(key))
    }

    for (k <- b.keySet) {
      println(k + ": " + b(k))
    }

    for (v <- b.values) {
      println(v)
    }
  }

}
