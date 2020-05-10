package cn.yifeng.feignconsumer.entity;

import lombok.*;

/**
 * @program: Intelligent_lamp_post
 * @description: user
 * @author: Yifeng
 * @create: 2020-05-07 11:23
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private Integer age;

    public User(String yifeng, int i) {
        this.name = yifeng;
        this.age = i;
    }
}
