package com.xingtb.course03

import scala.collection.mutable.ArrayBuffer

object ArrayApp extends App {

  // 定长数组
  val a = new Array[String](5)
  a(1) = "hello"
  println(a(1))

  private val b = Array("a", "b", "c")

  // 可变数组
  val ints: ArrayBuffer[Int] = ArrayBuffer[Int]()

  ints += 1
  ints += (2, 3, 4)
  ints ++= Array(5, 6, 7, 8)
  ints.insert(0, 0)
  ints.remove(1)
  ints.remove(0, 3)
//  ints.trimEnd(2)
//  ints.trimStart(2)

  // reverse顺序取反
  for (a <- ints.indices.reverse) {
    println(ints(a))
  }
  println(ints)
  ints.toArray
}
