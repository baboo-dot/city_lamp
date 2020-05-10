package cn.yifeng.feignconsumer.controller;

import cn.yifeng.feignconsumer.entity.User;
import cn.yifeng.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: feign-consumer
 * @description: consumerController
 * @author: Yifeng
 * @create: 2020-05-07 10:53
 **/

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("Yifeng")).append("\n");
        sb.append(helloService.hello("Yifeng",22)).append("\n");
        sb.append(helloService.hello(new User("Yifeng",22))).append("\n");
        return sb.toString();
    }
}
