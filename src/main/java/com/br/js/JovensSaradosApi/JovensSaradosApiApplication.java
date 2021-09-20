package com.br.js.JovensSaradosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

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
