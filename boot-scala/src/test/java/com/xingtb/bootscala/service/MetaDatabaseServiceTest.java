package com.xingtb.bootscala.service;

import com.google.gson.Gson;
import com.xingtb.bootscala.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {
    @Autowired private MetaDatabaseService metaDatabaseService;
    private final Gson gson = new Gson();

    @Test
    public void testSave() {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocation("hdfs://hadoop000:8020/user/hive/warehouse");
        metaDatabaseService.save(metaDatabase);
    }

    @Test
    public void testQuery() {
        Iterable<MetaDatabase> query = metaDatabaseService.query();
        for (MetaDatabase metaDatabase : query) {
            System.out.println(gson.toJson(metaDatabase));
        }
    }
}
