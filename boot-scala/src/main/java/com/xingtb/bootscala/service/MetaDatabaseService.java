package com.xingtb.bootscala.service;

import com.xingtb.bootscala.domain.MetaDatabase;

import java.util.Optional;

public interface MetaDatabaseService {

    MetaDatabase save(MetaDatabase metaDatabase);

    Iterable<MetaDatabase> query();

    Optional<MetaDatabase> queryById(Integer id);
}
