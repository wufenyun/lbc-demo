package com.lbc.demo.application.config;


import com.lbc.config.LbcConfiguration;
import com.lbc.context.DefaultCacheContext;
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
        LbcConfiguration configuration = new LbcConfiguration.Builder()
                .lruEliminationConfig(10)
                .zkMonitorConfig("127.0.0.1:2181","rms")
                .build();
        bean.setConfiguration(configuration);

        return bean;
    }

}
