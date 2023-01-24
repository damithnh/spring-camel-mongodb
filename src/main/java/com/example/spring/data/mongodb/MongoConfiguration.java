package com.example.spring.data.mongodb;

import com.mongodb.ConnectionString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@Configuration
public class MongoConfiguration {
    @Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        ConnectionString conn = new ConnectionString("mongodb://root:rootpassword@localhost:27017/?authSource=admin");
        mongo.setConnectionString(conn);
        return mongo;
    }
}
