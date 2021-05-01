package com.stackroute.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gateway(RouteLocatorBuilder builder){
       return builder.routes().route(r-> r.path("/api/v1/*").uri("http://localhost:8098/")).build();
    }
}
