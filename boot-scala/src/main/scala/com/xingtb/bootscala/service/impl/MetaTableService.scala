package com.xingtb.bootscala.service.impl

import com.xingtb.bootscala.domain.MetaTable
import com.xingtb.bootscala.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Iterable
import java.util.Optional

@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) extends com.xingtb.bootscala.service.MetaTableService {

  @Transactional
  override def save(metaTable: MetaTable): MetaTable = {
    metaTableRepository.save(metaTable)
  }

  override def query(): Iterable[MetaTable] = {
    metaTableRepository.findAll()
  }

  override def queryById(id: Integer): Optional[MetaTable] = {
    metaTableRepository.findById(id)
  }
}
