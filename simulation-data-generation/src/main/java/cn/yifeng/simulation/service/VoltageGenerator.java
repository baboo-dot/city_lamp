package cn.yifeng.simulation.service;

import cn.yifeng.simulation.dto.Voltage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Random;

/**
 * @program: simulation_data_acquisition
 * @description: 模拟上传电压数据
 * @author: Yifeng
 * @create: 2020-05-10 16:44
 **/
@Component
public class VoltageGenerator {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        Random random = new Random();
        Voltage voltage = new Voltage(random.nextFloat()*100, new Timestamp((System.currentTimeMillis()
                +8*60*60*1000)));
        this.rabbitTemplate.convertAndSend("voltage", voltage);
    }
}