package org.bcia.julongchain.consenter.common.localconfig;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 类描述
 *
 * @author zhangmingyang
 * @date 2018/08/26
 * @company Dingxuan
 */
public class ConsenterConfigFactoryTest {

    @Test
    public void getConsenterConfig() {
       ConsenterConfig consenterConfig= ConsenterConfigFactory.getConsenterConfig();
       System.out.println(consenterConfig.getFileLedger().getGroupName());
    }

    @Test
    public void loadConsenterConfig() {
    }
}