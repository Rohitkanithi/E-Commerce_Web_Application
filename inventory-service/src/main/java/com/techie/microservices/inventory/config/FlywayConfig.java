package com.techie.microservices.inventory.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

    @Bean
    public Flyway flyway() {
        return Flyway.configure()
                .dataSource("jdbc:mysql://localhost:3308/inventory_service", "root", "mysql")
                .load();
    }
}

