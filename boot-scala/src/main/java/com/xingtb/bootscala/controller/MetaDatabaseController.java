package com.xingtb.bootscala.controller;

import com.xingtb.bootscala.domain.MetaDatabase;
import com.xingtb.bootscala.service.MetaDatabaseService;
import com.xingtb.bootscala.utils.ResultEntity;
import com.xingtb.bootscala.utils.ResultEntityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(value = "/meta/database")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/save",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultEntity save(@RequestBody @Valid MetaDatabase metaDatabase) {
        return ResultEntityUtil.success(metaDatabaseService.save(metaDatabase));
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResultEntity query() {
        return ResultEntityUtil.success(metaDatabaseService.query());
    }

    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    public ResultEntity query(@PathVariable(value = "id") Integer id) {
        Optional<MetaDatabase> optional = metaDatabaseService.queryById(id);
        return ResultEntityUtil.success(optional.orElse(new MetaDatabase()));
    }
}
