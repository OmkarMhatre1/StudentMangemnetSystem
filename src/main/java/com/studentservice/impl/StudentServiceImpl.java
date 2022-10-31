package com.studentservice.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.Student;
import com.studentRepository.StudentRepository;
import com.studentservice.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudent() {
		
		return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repository.save(student);
	}

	@Override
	public Optional<Student> getStudentbyId(Long id) {
		return repository.findById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		Student student2=repository.findById(student.getId()).orElse(null);
		student2.setFirstName(student.getFirstName());
		student2.setLastName(student.getLastName());
		student2.setEmail(student.getEmail());
		return repository.save(student2);
	}

	@Override
	public String deleteStudent(Long id) {
		repository.deleteById(id);
		return "student deleted"+id;
		
		
	}

}
