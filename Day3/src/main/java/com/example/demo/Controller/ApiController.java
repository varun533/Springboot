package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modals.Employee;

import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService sr;
	
	@GetMapping("/")
	public List<Employee> show(){
		return sr.showinfo();
	}
	@PostMapping("post")
	public Employee add(@RequestBody Employee e) {
		return sr.saveinfo(e);
	}
}
