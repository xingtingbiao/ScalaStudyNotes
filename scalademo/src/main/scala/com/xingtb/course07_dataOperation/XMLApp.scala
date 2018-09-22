package com.xingtb.course07_dataOperation

import java.io.FileInputStream

import scala.xml.XML

object XMLApp {

  def main(args: Array[String]): Unit = {
    // loadXML()
    readXMLAttr()
  }

  private def loadXML(): Unit = {
    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    // val xml = XML.load(new FileInputStream("G:\\ScalaStudyNotes\\scalademo\\src\\main\\resources\\test.xml"))
    println(xml)
  }

  private def readXMLAttr(): Unit = {
    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    // header/field
    val headerField = xml \ "header" \ "field"
    println(headerField)
    // all fields
    val fields = xml \\ "field"
    // println(fields)
    for (field <- fields) {
      println(field)
    }
    // header/field/name
    val fieldNames = (xml \ "header" \ "field").map(_ \ "@name")
    // val fieldNames = (xml \ "header" \ "field" \\ "@name")
    for (name <- fieldNames) {
      println(name)
    }

    // field/name = "XTB"
    // val fs = (xml \\ "field").filter(_.attribute("name").exists(_.text.equals("XTB")))
    val fs = (xml \\ "field").filter(x => (x \ "@name").text.equals("XTB"))
    println(fs)

    // field/name  value
    (xml \\ "field").map(x => ((x \ "@name").text, x.text, x \ "@required")).foreach(println)
  }
}
