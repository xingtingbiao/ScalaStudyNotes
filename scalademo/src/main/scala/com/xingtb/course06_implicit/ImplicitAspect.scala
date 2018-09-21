package com.xingtb.course06_implicit

import java.io.File

object ImplicitAspect {

  /**
    * 定义一个隐式转换函数即可
    * 参数是普通对象, 返回牛逼对象, 代码块new 一个牛逼对象
    */
  implicit def manToSupper(man: Man): SuperMan = {new SuperMan(man.name)}

  implicit def fileToRich(file: File): RichFile = new RichFile(file)

}
