package com.testservice.HystrixService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myservice")
public class TestController {

	@GetMapping("/gettempdata")
	public String gettempdata() {
		return "Content from actual service";
	}
}