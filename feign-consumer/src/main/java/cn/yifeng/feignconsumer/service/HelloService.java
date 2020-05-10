package cn.yifeng.feignconsumer.service;

import cn.yifeng.feignconsumer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    // Spting MVC不设置value会默认使用参数名作为默认值，而feign必须指定value
    @RequestMapping(value = "/hello1")
    public String hello(@RequestParam String name);

    @RequestMapping(value = "/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
