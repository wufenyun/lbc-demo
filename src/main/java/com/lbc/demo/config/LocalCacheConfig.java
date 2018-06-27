package com.lbc.demo.config;

import com.lbc.DefaultCacheContext;
import com.lbc.config.CacheConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 本地批量缓存配置  
 * Date: 2018年3月5日 下午2:03:17
 * @author wufenyun
 */
@Configuration
public class LocalCacheConfig {

    @Bean()
    public DefaultCacheContext config() throws Exception {
        DefaultCacheContext bean = new DefaultCacheContext();
        CacheConfiguration configuration = new CacheConfiguration.Builder()
                .cacheSizeThreshold(10)
                .build();
        bean.setConfiguration(configuration);
        return bean;
    }

}
