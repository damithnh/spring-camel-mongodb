package com.example.spring.data.mongodb;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute1 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	//from("file:C://inputFolder1?noop=true").to("file:C://outputFolder1");
        from("direct:getTutorials")
                .to("mongodb:mongo?database=bezkoder_db&collection=tutorials&operation=findAll");
        from("direct:saveTutorial")
                .to("mongodb:mongo?database=bezkoder_db&collection=tutorials&operation=insert");
    }
}
