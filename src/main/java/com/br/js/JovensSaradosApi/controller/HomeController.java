package com.br.js.JovensSaradosApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String getHome() {
		return "Api Jovens Sarados<br /><a href=\"swagger-ui.html\">Swagger</a>";
	}
}
