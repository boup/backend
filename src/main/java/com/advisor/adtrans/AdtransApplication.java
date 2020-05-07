package com.advisor.adtrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AdtransApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdtransApplication.class, args);
	}

}
