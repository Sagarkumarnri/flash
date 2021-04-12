package com.sagar.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sagar.springdatajpa.entities.Student;
import com.sagar.springdatajpa.repos.studentRepository;
import static org.junit.Assert.*;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
private studentRepository repository;
	@Test
	void testSaveStudent() {
		Student student=new Student();
		student.setId(1l);
		student.setTestScore(100);
		repository.save(student);
		
	Student savedStudent=repository.findById( 1l).get();
	assertNotNull(savedStudent);
	
		
	}

}
