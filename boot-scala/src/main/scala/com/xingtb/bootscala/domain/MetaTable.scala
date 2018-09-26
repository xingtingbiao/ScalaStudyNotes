package com.xingtb.bootscala.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

@Entity
@Table
class MetaTable {

  /** @BeanProperty: 自动生成set/get方法 */
  @Id
  @GeneratedValue
  @BeanProperty
  var id: Integer = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var tableType: String = _

  @BeanProperty
  var dbId: Integer = _

}
