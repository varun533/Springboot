package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.modals.Employee;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepo er;
	
	public Employee saveinfo(Employee e) {
		return er.save(e);
		
	}
	
	public List<Employee> showinfo() {
		return er.findAll();
	}
	
}
