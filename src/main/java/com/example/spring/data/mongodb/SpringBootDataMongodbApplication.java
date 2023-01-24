package com.example.spring.data.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataMongodbApplication.class, args);
	}


//	@Bean
//	public MongoClientFactoryBean mongo() {
//		MongoClientFactoryBean mongo = new MongoClientFactoryBean();
//		ConnectionString conn = new ConnectionString("mongodb://root:rootpassword@localhost:27017/?authSource=admin");
//		mongo.setConnectionString(conn);
//		return mongo;
//	}
}
