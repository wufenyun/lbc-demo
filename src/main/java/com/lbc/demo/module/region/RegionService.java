package com.lbc.demo.module.region;

import com.lbc.LocalCache;
import com.lbc.demo.common.ServiceBase;
import com.lbc.demo.common.param.Result;
import com.lbc.demo.module.region.dao.RegionMapper;
import com.lbc.demo.module.region.dto.RegionDto;
import com.lbc.wrap.QueryingCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: wufenyun
 * @date: 2018-06-27 13
 **/
@Service
public class RegionService extends ServiceBase {

    @Autowired
    private LocalCache localCache;

    public Result listAll() {
        QueryingCollection<RegionDto> queryingCollection = localCache.get("regionTable");
        return success(queryingCollection.generateTrees());
    }
}