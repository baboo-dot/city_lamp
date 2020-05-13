package cn.yifeng.simulation.dao;

import cn.yifeng.simulation.dto.Weather;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface WeatherMapper {

    @Select("SELECT * FROM T_WEATHER")
    List<Weather> queryAll();

    @Select("SELECT * FROM T_WEATHER WHERE ID = #{ID}")
    Weather findVoltageById(@Param("ID") Integer ID);

    @Insert("INSERT INTO T_WEATHER(TEMPERATURE, HUMIDITY, TIMESTAMP) VALUES(#{TEMPERATURE}, #{HUMIDITY}, #{TIMESTAMP})")
    int insert(@Param("TEMPERATURE") Float TEMPERATURE, @Param("HUMIDITY") Float HUMIDITY,
               @Param("TIMESTAMP") Timestamp timestamp);

    @Delete("DELETE FROM T_WEATHER")
    int deleteAll();
}
