package com.example.cloud.Gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/FirstClass/**")
                        .uri("http://localhost:8089/"))

                .route(r -> r.path("/SecondClass/**")
                        .uri("http://localhost:8081/"))
                .build();
    }

}
