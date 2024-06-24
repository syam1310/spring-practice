package com.school.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.school.eazyschool.repository")
@EntityScan("com.school.eazyschool.model")
public class EazyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}

}
