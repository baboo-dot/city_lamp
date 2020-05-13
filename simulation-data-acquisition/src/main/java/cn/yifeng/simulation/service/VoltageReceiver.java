package cn.yifeng.simulation.service;

import cn.yifeng.simulation.dao.VoltageMapper;
import cn.yifeng.simulation.dto.Voltage;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: city_lamp
 * @description: 电压数据接收
 * @author: Yifeng
 * @create: 2020-05-13 16:02
 **/
@Component
@RabbitListener(queues = "voltage")
public class VoltageReceiver {

    @Autowired
    VoltageMapper voltageMapper;

    @RabbitHandler
    public void process(Voltage voltage) {
        voltageMapper.insert(voltage.getVoltage(),voltage.getTimestamp());
    }
}