package com.springtask.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtask.api.controller.entities.Students;
import com.springtask.api.services.StudentService;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	//get all students
	@GetMapping("/students")
	public List<Students> getStudents()
	{
		return studentService.getStudents();
	}
	
	//search student by id
	@GetMapping("/students/{studentid}")
	public Students getStudent(@PathVariable String studentid)
	{
		return this.studentService.getStudent(Long.parseLong(studentid));
		//return (Students) studentService.getStudents();
	}
	
	//add a student
	@PostMapping(path="/students",consumes = "application/json")
	public Students addStudent(@RequestBody Students students)
	{
		return this.studentService.addStudent(students);
	}
	

}
