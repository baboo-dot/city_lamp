package cn.yifeng.simulation.controller;

import cn.yifeng.simulation.dao.VoltageMapper;
import cn.yifeng.simulation.dao.WeatherMapper;
import cn.yifeng.simulation.dto.Voltage;
import cn.yifeng.simulation.dto.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: city_lamp
 * @description: 控制器
 * @author: Yifeng
 * @create: 2020-05-14 13:13
 **/
@RestController
public class ReceiveController {

    @Autowired
    VoltageMapper voltageMapper;

    @Autowired
    WeatherMapper weatherMapper;

    @RequestMapping("/voltage")
    public List<Voltage> queryAllVoltage(){
        return voltageMapper.queryAll();
    }

    @RequestMapping("/weather")
    public List<Weather> queryAllWeather(){
        return weatherMapper.queryAll();
    }
}
