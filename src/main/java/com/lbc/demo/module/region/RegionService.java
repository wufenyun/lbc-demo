package com.lbc.demo.module.region;

import com.lbc.LocalCache;
import com.lbc.demo.application.common.ServiceBase;
import com.lbc.demo.application.common.param.Result;
import com.lbc.demo.module.region.dto.RegionDto;
import com.lbc.demo.util.AssertUtil;
import com.lbc.wrap.QueryingCollection;
import com.lbc.wrap.query.Criteria;
import com.lbc.wrap.query.Example;
import com.lbc.wrap.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: wufenyun
 * @date: 2018-06-27 13
 **/
@Service
public class RegionService extends ServiceBase {

    private final static Logger logger = LoggerFactory.getLogger(RegionService.class);

    @Autowired
    private LocalCache localCache;

    public Result listAll() {
        QueryingCollection<RegionDto> queryingCollection = localCache.get("allRegion");
        return success(queryingCollection.all());
    }

    public Result listAllWithTree() {
        QueryingCollection<RegionDto> queryingCollection = localCache.get("allRegion");
        return success(queryingCollection.generateTrees());
    }

    public Result getByRegionId(Integer regionId) {
        AssertUtil.notNull(regionId);

        QueryingCollection<RegionDto> queryingCollection = localCache.get("allRegion");

        //查询方式1
        RegionDto example = new RegionDto();
        example.setRegionId(regionId);
        RegionDto regionDto = queryingCollection.queryUnique(Query.query(Example.of(regionId)));

        //查询方式2
        regionDto = queryingCollection.queryUnique(Query.query(Criteria.where("regionId").is(regionId)));

        return success(regionDto);
    }
}