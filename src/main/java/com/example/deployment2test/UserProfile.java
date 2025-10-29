package com.example.deployment2test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "userprofile")

public class UserProfile {
    private String name;
    private int age;
    private String gender;
}
