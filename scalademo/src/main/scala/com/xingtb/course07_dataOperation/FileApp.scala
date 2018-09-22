package com.xingtb.course07_dataOperation

import scala.io.{BufferedSource, Source}

object FileApp {

  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("test.txt")(scala.io.Codec.UTF8)
    // readLines(file)
    // readChar(file)
    readNet()
  }

  private def readLines(file: BufferedSource): Unit = {
    for (line <- file.getLines()) {
      println(line)
    }
  }

  private def readChar(file: BufferedSource): Unit = {
    for (ele <- file) {
      println(ele)
    }
  }

  private def readNet(): Unit = {
    val file = Source.fromURL("http://www.baidu.com")
    readLines(file)
  }
}
