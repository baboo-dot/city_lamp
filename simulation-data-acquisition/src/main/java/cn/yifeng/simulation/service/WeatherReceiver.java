package cn.yifeng.simulation.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: city_lamp
 * @description: 气象数据接收
 * @author: Yifeng
 * @create: 2020-05-13 16:02
 **/
@Component
@RabbitListener(queues = "weather")
public class WeatherReceiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver :" + hello);
    }
}
