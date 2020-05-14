package cn.yifeng.simulation.service;

import cn.yifeng.simulation.dao.WeatherMapper;
import cn.yifeng.simulation.dto.Weather;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    WeatherMapper weatherMapper;

    @RabbitHandler
    public void process(Weather weather) {
        weatherMapper.insert(weather.getTemperature(),weather.getHumidity(),weather.getTimestamp());
    }
}
