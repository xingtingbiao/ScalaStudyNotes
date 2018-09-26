package com.xingtb.bootscala.repository

import com.xingtb.bootscala.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable, Integer] {

}
