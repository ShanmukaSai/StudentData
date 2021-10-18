package com.springtask.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springtask.api.controller.entities.Students;

public class StudentService {
	
	@Autowired
	private StudentserviceImpl studentserviceImpl;
	
	public List<Students> getStudents() {
		return studentserviceImpl.getStudents();
	}
	
	public Students getStudent(long studentid) {
		
		return studentserviceImpl.getStudent(studentid);
	}
	
	public Students addStudent(Students students) {
		
		return studentserviceImpl.addStudent(students);
	}

}
