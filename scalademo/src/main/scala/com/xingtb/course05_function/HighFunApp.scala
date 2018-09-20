package com.xingtb.course05_function

import scala.collection.mutable

/**
  * 高阶函数: map, filter, flatmap, foreach, reduce
  */
object HighFunApp {

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5, 6, 7, 8)
    l.take(3).foreach(println) // take(n) 取前面n个元素

    /**
      * map: 逐个操作集合中的每个元素
      */
    l.map(x => x + 1)
    l.map(_ * 2).foreach(println)
    println("----------------------------------------")
    // filter
    l.map(_ * 2).filter(_ > 8).foreach(println)

    println("----------------------------------------")

    /**
      * reduce
      * 1+2 3+3 6+4 10+5
      */
    println(l.reduce(_ + _))
    println(l.reduceLeft(_ + _))
    println(l.reduceRight(_ + _))

    println(l.reduce(_ - _)) // 从左推导
    println(l.reduceLeft(_ - _)) // 从左推导
    println(l.reduceRight(_ - _)) // 从右推导

    /**
      * 类似柯里化的reduce, 第一个值是给的第一个参数值(+ 运算)
      */
    println(l.fold(0)(_ - _))
    println(l.foldLeft(2)(_ - _))
    println(l.foldRight(2)(_ - _))

    println("----------------------------------------")

    /**
      * flatmap 使用
      */
    val f = List(List(1,2), List(3,4), List(5,6), List(7,8))
    println(f.flatten.map(_*2))
    println(f.flatten(s => s).map(_*2)) // 先压扁再map
    println(f.map(_.map(_*2)))
    println(f.flatMap(s => s).map(_*2)) // 先压扁再map
    println(f.flatMap(_.map(_*2))) // 先将元素进行map, 再压扁

    println("----------------------------")
    val s: String = "hello,world,hello,world"
    // 链式编程
    val unit = List(s).flatMap(_.split(",")).map(x => (x, 1))
    println(unit)
    println(myFun(unit))
  }

  def myFun(list: List[(String, Int)]): mutable.Map[String, Int] = {
    val map = new mutable.HashMap[String, Int]()
    for (l <- list) {
      val option = map.get(l._1)
      option match {
        case Some(_) => map(l._1) += 1
        case None => map += (l._1 -> 1)
      }
    }
    map
  }

}
