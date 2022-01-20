package com.example.formconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FormconfigurationserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormconfigurationserviceApplication.class, args);
    }

}
