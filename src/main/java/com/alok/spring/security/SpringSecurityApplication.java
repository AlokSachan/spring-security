package com.alok.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan("com.alok.spring.security.controller")
@ComponentScans({@ComponentScan("com.alok.spring.security.controller"),
		@ComponentScan("com.alok.spring.security.config")})
@EnableJpaRepositories("com.alok.spring.security.repository")
@EntityScan("com.alok.spring.security.model")

public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
