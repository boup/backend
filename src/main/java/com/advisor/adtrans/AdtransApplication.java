package com.advisor.adtrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaAuditing
@EnableJpaRepositories
@ComponentScan({"com.advisor.adtrans.controller"})
public class AdtransApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdtransApplication.class, args);
	}

}
