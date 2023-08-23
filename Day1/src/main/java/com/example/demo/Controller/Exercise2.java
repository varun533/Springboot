package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {
  
      public String name="Praveen";
      @GetMapping("/name")
      
      public String getName()
      {
    	  return "Welcome "+name;
      }
}