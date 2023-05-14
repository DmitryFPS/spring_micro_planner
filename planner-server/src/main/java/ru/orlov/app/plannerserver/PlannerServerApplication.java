package ru.orlov.app.plannerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlannerServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlannerServerApplication.class, args);
    }
}