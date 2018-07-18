/**
 * Package: com.lbc.test
 * Description: 
 */
package com.lbc.demo.test;

import com.lbc.consistency.eventdriven.support.ZkCacheStatusChanger;
import org.junit.Test;

/**
 * Description:  
 * Date: 2018年3月12日 下午5:32:16
 * @author wufenyun 
 */
public class ZkStatusChangerTest {

    private String connection = "127.0.0.1:2181";
    private ZkCacheStatusChanger statusChanger = new ZkCacheStatusChanger(connection,"rms");

    @Test
    public void change() throws InterruptedException {
        statusChanger.updateStatus("regionTable");
    }
    
}
