package com.lingh.shardingspherev540readwritesplittingtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lingh.shardingspherev540readwritesplittingtest.mapper")
public class ShardingsphereV540ReadwriteSplittingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingsphereV540ReadwriteSplittingTestApplication.class, args);
	}

}