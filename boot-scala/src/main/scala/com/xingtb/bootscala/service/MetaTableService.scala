package com.xingtb.bootscala.service

import java.util.Optional
import java.lang.Iterable

import com.xingtb.bootscala.domain.MetaTable

trait MetaTableService {
  def save(metaTable: MetaTable): MetaTable
  def query(): Iterable[MetaTable]
  def queryById(id: Integer): Optional[MetaTable]
}
