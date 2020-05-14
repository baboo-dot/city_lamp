package cn.yifeng.simulation.dto;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @program: city_lamp
 * @description: 气象
 * @author: Yifeng
 * @create: 2020-05-13 15:34
 **/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Weather implements Serializable {
    private Float temperature;
    private Float humidity;
    private Timestamp timestamp;
}
