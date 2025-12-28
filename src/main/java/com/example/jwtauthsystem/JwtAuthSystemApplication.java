package com.example.jwtauthsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class JwtAuthSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthSystemApplication.class, args);
    }

}
