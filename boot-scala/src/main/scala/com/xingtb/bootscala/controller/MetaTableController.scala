package com.xingtb.bootscala.controller

import com.xingtb.bootscala.domain.MetaTable
import com.xingtb.bootscala.service.MetaTableService
import com.xingtb.bootscala.utils.{ResultEntity, ResultEntityUtil}
import javax.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(value = Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/save"),
    method = Array(RequestMethod.POST),
    consumes = Array(MediaType.APPLICATION_JSON_VALUE),
    produces = Array(MediaType.APPLICATION_JSON_VALUE))
  def save(@RequestBody @Valid metaTable: MetaTable): ResultEntity[_] = {
    ResultEntityUtil.success(metaTableService.save(metaTable))
  }

  @RequestMapping(value = Array("/query"),
    method = Array(RequestMethod.GET))
  def query(): ResultEntity[_] = {
    ResultEntityUtil.success(metaTableService.query())
  }

  @RequestMapping(value = Array("/query/{id}"),
    method = Array(RequestMethod.GET))
  def queryById(@PathVariable(value = "id") id: Integer): ResultEntity[_] = {
    val value = metaTableService.queryById(id)
    ResultEntityUtil.success(value.orElse(new MetaTable))
  }
}
