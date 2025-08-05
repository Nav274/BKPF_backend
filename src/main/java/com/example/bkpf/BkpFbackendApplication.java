package com.example.bkpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.bkpf", "Controllers"})
@EnableJpaRepositories(basePackages = "Repositories")
@EntityScan(basePackages = "Entities")
public class BkpFbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkpFbackendApplication.class, args);
	}

}
