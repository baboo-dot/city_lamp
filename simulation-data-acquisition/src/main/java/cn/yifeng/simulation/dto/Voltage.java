package cn.yifeng.simulation.dto;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @program: city_lamp
 * @description: 电压
 * @author: Yifeng
 * @create: 2020-05-13 15:33
 **/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Voltage implements Serializable {
    private Float voltage;
    private Timestamp timestamp;
}
