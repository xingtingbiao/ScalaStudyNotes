package com.xingtb.bootscala.service.impl;

import com.xingtb.bootscala.domain.MetaDatabase;
import com.xingtb.bootscala.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MetaDatabaseService implements com.xingtb.bootscala.service.MetaDatabaseService {
    @Autowired private MetaDatabaseRepository metaDataBaseRepository;


    @Transactional
    @Override
    public MetaDatabase save(MetaDatabase metaDatabase) {
        return metaDataBaseRepository.save(metaDatabase);
    }

    @Override
    public Iterable<MetaDatabase> query() {
        return metaDataBaseRepository.findAll();
    }
}
