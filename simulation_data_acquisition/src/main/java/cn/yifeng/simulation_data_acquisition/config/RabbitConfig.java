package cn.yifeng.simulation_data_acquisition.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: simulation_data_acquisition
 * @description: RabbitMQ配置
 * @author: Yifeng
 * @create: 2020-05-10 16:46
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue weatherQueue() {
        return new Queue("weather");
    }

    @Bean
    public Queue voltageQueue() {
        return new Queue("voltage");
    }
}
