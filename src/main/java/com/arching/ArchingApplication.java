package com.arching;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.arching.dao")
@MapperScan("com.arching.dao.userMapper")
public class ArchingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchingApplication.class, args);
	}
}
