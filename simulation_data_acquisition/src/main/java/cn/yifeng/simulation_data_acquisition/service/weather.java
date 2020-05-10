package cn.yifeng.simulation_data_acquisition.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: simulation_data_acquisition
 * @description: 模拟上传气象数据
 * @author: Yifeng
 * @create: 2020-05-10 16:43
 **/
@Component
public class weather {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        //context中weather换成电压数据
        String context = "weather" + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("weather",context);
    }
}
