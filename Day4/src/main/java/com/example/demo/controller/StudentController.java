package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sser;
	
	@PostMapping("addstudent")
	public List<StudentEntity> add(@RequestBody List<StudentEntity> ss) {
		return sser.saveinfo(ss);
	}
	
	@GetMapping("showdetails")
	public List<StudentEntity> show(){
		return sser.showinfo();
	}
	
	@DeleteMapping("delete")
	public String deleteStudent(@RequestParam int id) {
		sser.delete(id);
		return "Id "+id+" deleted Successfully";
	}
	
	@PutMapping("update")
	public String updateStudent(@RequestBody StudentEntity ss ) {
		sser.update(ss);
		return "Id "+ss.getId()+" is updated successfully!";
	}
}
