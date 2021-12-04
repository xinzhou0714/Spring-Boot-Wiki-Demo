package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        Environment env = app.run(args).getEnvironment();

        logger.info("app started successfully ! ! !");
        logger.info("Address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

        //logger.info("Hi you see this info");
        //logger.debug("Hi you cannot see this debug, because debug<info");
    }

}
