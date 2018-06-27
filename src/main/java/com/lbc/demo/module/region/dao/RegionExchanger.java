package com.lbc.demo.module.region.dao;

import com.lbc.demo.module.region.dto.RegionDto;
import com.lbc.exchanger.CacheExchanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description: 地域信息缓存接口
 * @author: wufenyun
 * @date: 2018-06-21 14
 **/
@Component
public class RegionExchanger implements CacheExchanger<String,RegionDto>{

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<RegionDto> load(String key) throws Exception {
        return regionMapper.listAll();
    }

    @Override
    public String prelaodingKey() {
        return "regionTable";
    }

    @Override
    public List<RegionDto> prelaoding() throws Exception {
        return regionMapper.listAll();
    }
}