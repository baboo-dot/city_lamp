package cn.yifeng.simulation.dao;

import cn.yifeng.simulation.dto.Voltage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

@Repository
public interface VoltageMapper {

    @Select("SELECT * FROM T_VOLTAGE")
    List<Voltage> queryAll();

    @Select("SELECT * FROM T_VOLTAGE WHERE ID = #{ID}")
    Voltage findVoltageById(@Param("ID") Integer ID);

    @Insert("INSERT INTO T_VOLTAGE(VOLTAGE, TIMESTAMP) VALUES(#{VOLTAGE}, #{TIMESTAMP})")
    int insert(@Param("VOLTAGE") Float VOLTAGE, @Param("TIMESTAMP") Timestamp TIMESTAMP);



    @Delete("DELETE FROM T_VOLTAGE")
    int deleteAll();

//    @Select("SELECT * FROM VOLTAGE WHERE ID = #{ID}")
//    Voltage findVoltageById(@Param("ID") Integer ID);
//
//    @Insert("INSERT INTO VOLTAGE(ID, VOLTAGE) VALUES(#{ID}, #{VOLTAGE})")
//    int insert(@Param("ID") Integer ID, @Param("VOLTAGE") Float VOLTAGE);
}
