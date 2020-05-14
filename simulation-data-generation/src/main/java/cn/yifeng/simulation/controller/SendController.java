package cn.yifeng.simulation.controller;

import cn.yifeng.simulation.dto.Voltage;
import cn.yifeng.simulation.dto.Weather;
import cn.yifeng.simulation.service.VoltageGenerator;
import cn.yifeng.simulation.service.WeatherGenerator;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: city_lamp
 * @description: send
 * @author: Yifeng
 * @create: 2020-05-14 12:13
 **/
@RestController
public class SendController {


    @Autowired
    WeatherGenerator weatherGenerator;

    @Autowired
    VoltageGenerator voltageGenerator;

    @RequestMapping("/weather")
    public String sendWeather(){
        weatherGenerator.send();
        return "Send Random Weather Successfully";
    }

    @RequestMapping("/voltage")
    public String sendVoltage(){
        voltageGenerator.send();
        return "Send Random Voltage Successfully";
    }
}
