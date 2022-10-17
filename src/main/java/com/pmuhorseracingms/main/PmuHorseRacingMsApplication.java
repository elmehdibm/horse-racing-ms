package com.pmuhorseracingms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "com.pmuhorseracingms.*")
public class PmuHorseRacingMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmuHorseRacingMsApplication.class, args);
    }

}
