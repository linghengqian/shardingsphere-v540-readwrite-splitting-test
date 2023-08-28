package com.lingh.shardingspherev540readwritesplittingtest.mapper;

import com.lingh.shardingspherev540readwritesplittingtest.entity.TOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@SuppressWarnings({"SqlDialectInspection", "SqlNoDataSourceInspection"})
@Component
public interface TOrderMapper {
    @Select("select * from t_order")
    List<TOrder> findAll();

    @Insert("insert into t_order (`name`,user_id) values (#{name},#{userId})")
    int addAll(@Param("name") String name, @Param("userId") Long userId);

    @Delete("delete from t_order where user_id = #{userId}")
    int deleteById(Long userId);

    @Delete("delete from t_order")
    int deleteAll();
}