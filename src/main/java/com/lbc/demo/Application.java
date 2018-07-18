package com.lbc.demo;

import com.lbc.config.EliminationConfig;
import com.lbc.config.MonitorConfig;
import com.lbc.config.PreventPenetrationConfig;
import com.lbc.config.spring.EnableLbc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLbc(eliminationPolicy = EliminationConfig.EliminationPolicy.LRU,cacheSizeThreshold = 10, monitorModel = MonitorConfig.MonitorModel.EVENT_ZK, zkConnection = "127.0.0.1:2181", yourZkDataNode = "region",preventPenetrationPolicy = PreventPenetrationConfig.PreventPenetrationPolicy.BLOOM_FILTER)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
