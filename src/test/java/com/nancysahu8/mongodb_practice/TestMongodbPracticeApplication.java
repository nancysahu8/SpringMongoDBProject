package com.nancysahu8.mongodb_practice;

import org.springframework.boot.SpringApplication;

public class TestMongodbPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.from(MongodbPracticeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
