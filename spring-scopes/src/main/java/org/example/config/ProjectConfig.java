package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.beans", "org.example.service", "org.example.serviceInterfImpl"})
public class ProjectConfig {
    // Configuration details...
}
