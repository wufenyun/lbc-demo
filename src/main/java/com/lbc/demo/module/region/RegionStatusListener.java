package com.lbc.demo.module.region;

import com.alibaba.fastjson.JSON;
import com.lbc.context.event.CacheRefreshedEvent;
import com.lbc.context.event.Event;
import com.lbc.context.event.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RegionStatusListener implements EventListener<CacheRefreshedEvent> {

    private final static Logger logger = LoggerFactory.getLogger(RegionStatusListener.class);

    @Override
    public void onEvent(Event event) {
        logger.info(JSON.toJSONString(event));
    }
}
