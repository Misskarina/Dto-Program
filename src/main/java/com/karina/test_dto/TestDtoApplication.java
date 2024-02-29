package com.karina.test_dto;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
//@EnableScheduling
@SpringBootApplication
public class TestDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDtoApplication.class, args);
	}
	//@Scheduled(fixedDelay=5000)
	public void Schedule()
	{
		System.out.println("Current time"+new Date());
	}

}
