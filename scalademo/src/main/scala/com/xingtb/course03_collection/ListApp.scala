package com.xingtb.course03_collection

import scala.collection.mutable

// List 有序可重复
object ListApp {

  def main(args: Array[String]): Unit = {

    val l = List(1, 2, 3, 4, 5, 6)
    val head = l.head
    val tail = l.tail
    println(head)
    println(tail)

    println(l.max)
    println(l.min)
    println(l.sum)

    // Nil在Scala中就是一个空List, 1相当于List的head, Nil相当于tail
    val list = 1 :: Nil
    println(list)

    // 类似ArrayBuffer
    val l5 = scala.collection.mutable.ListBuffer[Int]()
    l5 += 2
    l5 += (1, 2)
    l5 ++= List(3, 4, 5, 6)
    l5.isEmpty
    println(l5)
  }


  // :_* 固定写法, 意思是将修饰的变量变成可变参数
  def sum(nums: Int*): Int = {
    if (nums.isEmpty) {
      0
    } else {
      nums.head + sum(nums.tail:_*)
    }
  }


  // Set 无序不重复
  val set: mutable.Set[Int] = scala.collection.mutable.Set[Int]()

}
