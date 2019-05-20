package com.xingtb

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureTest {
  def main(args: Array[String]): Unit = {
    var n = 0
    (1 to 20).foreach(index => Future {
      println(Thread.currentThread().getName + ", " + index)
      for (i <- 1 to 10000) {
        n += 1
      }
      Thread.sleep(1000)
    })
    println("AvailableProcessors: " + Runtime.getRuntime.availableProcessors()) //打印出可用处理器数目
    Thread.sleep(40000) //为了在程序结束前看到执行完所有任务，所以阻塞主线程
    println(n)
  }

}
