package com.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.dao.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	//Student findByName(String firstName);

}
