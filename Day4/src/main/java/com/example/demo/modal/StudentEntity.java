package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentEntity {
	
	public StudentEntity() {
		super();
	}
	public StudentEntity(int id, String studentName, String departmentName, String mailId) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.mailId = mailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getmailId() {
		return mailId;
	}
	public void setmailId(String mailId) {
		this.mailId = mailId;
	}
	
	
	@Id
	private int id;
	private String studentName;
	private String departmentName;
	private String mailId;
	

}