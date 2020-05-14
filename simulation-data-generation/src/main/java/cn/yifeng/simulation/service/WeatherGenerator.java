package cn.yifeng.simulation.service;

import cn.yifeng.simulation.dto.Voltage;
import cn.yifeng.simulation.dto.Weather;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

/**
 * @program: simulation_data_acquisition
 * @description: 模拟上传气象数据
 * @author: Yifeng
 * @create: 2020-05-10 16:43
 **/
@Component
public class WeatherGenerator {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        Random random = new Random();
        Weather weather = new Weather(random.nextFloat()*40, random.nextFloat()*100,
                new Timestamp(System.currentTimeMillis()));
        this.rabbitTemplate.convertAndSend("weather", weather);
    }
}
