package cn.yifeng.simulation;

import cn.yifeng.simulation.dao.VoltageMapper;
import cn.yifeng.simulation.dao.WeatherMapper;
import cn.yifeng.simulation.service.VoltageReceiver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

@SpringBootTest
class SimulationDataAcquisitionApplicationTests {

    @Autowired
    VoltageMapper voltageMapper;

    @Autowired
    WeatherMapper weatherMapper;

//    @Autowired
//    VoltageReceiver voltageReceiver;
    @Test
    void contextLoads() {
//        voltageReceiver.process("voltage");

//        数据库交互test
//        voltageMapper.insert(1.1f, new Timestamp(System.currentTimeMillis()));
//        voltageMapper.insert(1.2f, new Timestamp(System.currentTimeMillis()));
//        System.out.println(voltageMapper.queryAll());
//        voltageMapper.deleteAll();
//        System.out.println(voltageMapper.queryAll());
    }

}
