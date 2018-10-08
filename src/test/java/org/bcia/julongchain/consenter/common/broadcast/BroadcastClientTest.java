package org.bcia.julongchain.consenter.common.broadcast;

import org.bcia.julongchain.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Broadcast客户端测试类
 *
 * @author zhangmingyang
 * @Date 2018-02-26
 * @company Dingxuan
 */
public class BroadcastClientTest extends BaseJunit4Test {
    @Autowired
    public BroadcastClient broadcastClient;

    @Test
    public void send() throws Exception {
        String ip = "localhost";
        int port = 7050;
        String mess = "testmessage";
        //broadCastClient.send(ip,port,mess);
    }
}
