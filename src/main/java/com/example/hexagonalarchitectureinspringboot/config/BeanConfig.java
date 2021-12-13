package com.example.hexagonalarchitectureinspringboot.config;

import com.example.hexagonalarchitectureinspringboot.HexagonalArchitectureInSpringBootApplication;
import com.example.hexagonalarchitectureinspringboot.adapters.output.SocialMediaRepository;
import com.example.hexagonalarchitectureinspringboot.service.SocialMediaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalArchitectureInSpringBootApplication.class)
public class BeanConfig {

    @Bean
    SocialMediaService socialMediaService(SocialMediaRepository socialMediaRepository){
        return new SocialMediaService(socialMediaRepository,socialMediaRepository);
    }
}
