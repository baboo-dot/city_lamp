package cn.yifeng.simulation;

import cn.yifeng.simulation.service.VoltageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimulationDataGenerationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimulationDataGenerationApplication.class, args);
    }

}
