package com.code.farmer.openfeign.sample.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignSampleApplicationClient {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignSampleApplicationClient.class, args);
    }

}
