package com.springtask.api.services;

import java.util.List;

import com.springtask.api.controller.entities.Student;

public interface StudentService {
	
	
	
	public List<Student> getStudent(); 
	public Student getStudent(long studentid);
	public Student addStudent(Student student);
}
