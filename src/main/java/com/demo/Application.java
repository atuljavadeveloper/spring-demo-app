package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@Slf4j
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "com.demo.*" })
public class Application {

    public static void main(String[] args) throws Exception {

        log.debug("Starting Application");

        SpringApplication.run(Application.class, args);

        log.info("##################################################");
        log.info("Spring Demo App is started successfully.");
        log.info("##################################################");
    }
}
