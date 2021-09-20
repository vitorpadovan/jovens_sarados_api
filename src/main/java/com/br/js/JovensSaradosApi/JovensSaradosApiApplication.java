package com.br.js.JovensSaradosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class JovensSaradosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JovensSaradosApiApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Api Jovens Sarados";
	}
}
