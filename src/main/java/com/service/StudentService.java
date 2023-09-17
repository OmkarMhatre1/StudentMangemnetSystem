package com.service;

import java.util.List;
import java.util.Optional;

import com.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student saveStudent(Student student);

	Optional<Student> getStudentbyId(Long id);

	Student updateStudent(Student student);

	String deleteStudent(Long id);
}
