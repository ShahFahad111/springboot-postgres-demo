package com.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootPgDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPgDemoApplication.class, args);
	}

}
