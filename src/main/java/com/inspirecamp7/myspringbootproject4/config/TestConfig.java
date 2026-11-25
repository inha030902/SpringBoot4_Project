package com.inspirecamp7.myspringbootproject4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestConfig {
    @Bean
    public CustomVO customVO() {
        return CustomVO.builder() //CustomoerVOBuilder
                .mode("테스트 mode")
                .rate("0.5")
                .build();
    }
}
