package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modals.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	
}
