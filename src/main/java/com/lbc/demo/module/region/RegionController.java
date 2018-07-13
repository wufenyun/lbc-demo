package com.lbc.demo.module.region;

import com.lbc.demo.common.param.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: wufenyun
 * @date: 2018-06-27 14
 **/
@RestController
public class RegionController {

    @Autowired
    private RegionService regionService;

    @RequestMapping("region/listAll")
    public Result listAll(String key) {
        return regionService.listAll(key);
    }

    @RequestMapping("region/listWithLoad")
    public Result listWithLoad(String key) {
        return regionService.listByKey(key);
    }
}