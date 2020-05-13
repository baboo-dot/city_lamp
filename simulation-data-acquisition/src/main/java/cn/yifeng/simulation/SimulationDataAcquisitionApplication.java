package cn.yifeng.simulation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn/yifeng/simulation/dao")
public class SimulationDataAcquisitionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimulationDataAcquisitionApplication.class, args);
    }

}
