package cn.yifeng.simulation;

import cn.yifeng.simulation.service.VoltageGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimulationDataGenerationApplicationTests {

    @Autowired
    VoltageGenerator voltageGenerator;

    @Test
    void contextLoads() {
        voltageGenerator.send();
    }

}
