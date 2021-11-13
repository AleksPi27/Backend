package com.marketplace.fairmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FairmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(FairmarketApplication.class, args);
    }

}
