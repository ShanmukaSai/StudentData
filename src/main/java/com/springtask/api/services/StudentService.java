package com.springtask.api.services;

import java.util.List;

import com.springtask.api.controller.entities.Students;

public interface StudentService {
	
	
	
	public List<Students> getStudents(); 
	public Students getStudent(long studentid);
	public Students addStudent(Students students);
}
