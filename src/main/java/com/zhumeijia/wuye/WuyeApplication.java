package com.zhumeijia.wuye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class WuyeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuyeApplication.class, args);
    }

}
