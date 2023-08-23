package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
	@GetMapping("disp")
	public String Welcome()
	{
		return "<h1>WelcomeString Boot!</h1>";
	}

}