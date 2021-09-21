package com.br.js.JovensSaradosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JovensSaradosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JovensSaradosApiApplication.class, args);
	}
}
