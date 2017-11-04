package com.wheretogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wheretogo.controller")
//@EnableAutoConfiguration lets leave this commented, it may come in handy!
public class WhereToGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhereToGoApplication.class, args);
	}
}
