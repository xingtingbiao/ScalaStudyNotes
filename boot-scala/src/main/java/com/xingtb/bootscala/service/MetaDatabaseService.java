package com.xingtb.bootscala.service;

import com.xingtb.bootscala.domain.MetaDatabase;

public interface MetaDatabaseService {

    MetaDatabase save(MetaDatabase metaDatabase);

    Iterable<MetaDatabase> query();
}
