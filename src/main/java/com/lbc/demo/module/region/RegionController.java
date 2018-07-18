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
    public Result listAll() {
        return regionService.listAll();
    }

    @RequestMapping("region/listAllWithTree")
    public Result listAllWithTree() {
        return regionService.listAllWithTree();
    }

    @RequestMapping("region/getByRegionId")
    public Result getByRegionId(Integer regionId) {
        return regionService.getByRegionId(regionId);
    }
}