package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;

	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	
	@PostMapping("/addStudent")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> findById(@PathVariable Long id) {
		return service.getStudentbyId(id);
	}
	
	@PutMapping("/update")
	public Student updateStudnet(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return service.deleteStudent(id);
	}
}
