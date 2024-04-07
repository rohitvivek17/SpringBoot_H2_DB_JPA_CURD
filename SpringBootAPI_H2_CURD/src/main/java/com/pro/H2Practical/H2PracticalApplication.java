package com.pro.H2Practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pro")
public class H2PracticalApplication {
	public static void main(String[] args) {
		SpringApplication.run(H2PracticalApplication.class, args);
	}

}
