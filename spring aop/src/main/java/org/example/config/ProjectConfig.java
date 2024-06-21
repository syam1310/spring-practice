package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.service", "org.example.serviceInterfImpl","org.example.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {
    // Configuration details...
}
