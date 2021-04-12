package com.sagar.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.springdatajpa.entities.Student;

public interface studentRepository extends JpaRepository<Student,Long> {

}
