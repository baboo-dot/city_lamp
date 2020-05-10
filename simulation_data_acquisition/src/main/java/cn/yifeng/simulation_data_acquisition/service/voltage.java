package cn.yifeng.simulation_data_acquisition.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: simulation_data_acquisition
 * @description: 模拟上传电压数据
 * @author: Yifeng
 * @create: 2020-05-10 16:44
 **/
@Component
public class voltage {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        //context中voltage换成电压数据
        String context = "voltage" + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("voltage",context);
    }
}