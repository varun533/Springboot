package com.example.demo.service;

	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.example.demo.modal.StudentEntity;
	import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public  List<StudentEntity> saveinfo(List<StudentEntity> ss) {
		return sr.saveAll(ss);
	}
	
	public List<StudentEntity> showinfo(){
		return sr.findAll()	;
	}
	
	public void delete(int id) {
		sr.deleteById(id);
	}
	
	public void update(StudentEntity ss) {
		sr.saveAndFlush(ss);
	}
}
