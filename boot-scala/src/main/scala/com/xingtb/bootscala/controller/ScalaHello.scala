package com.xingtb.bootscala.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class ScalaHello {

  @RequestMapping(value = Array("/hello"), method = Array(RequestMethod.GET))
  def sayHello(): String ={
    "hello scala!"
  }

}
