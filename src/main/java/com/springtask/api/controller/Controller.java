package com.springtask.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springtask.api.controller.entities.Student;
import com.springtask.api.services.StudentService;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	//get all students
	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return studentService.getStudent();
	}
	
	//search student by id
	@GetMapping("/student/{studentid}")
	public Student getStudent(@PathVariable String studentid)
	{
		return this.studentService.getStudent(Long.parseLong(studentid));
	}
	
	//add a student
	@PostMapping(path="/student",consumes = "application/json")
	public Student addStudent(@RequestBody Student student)
	{
		return this.studentService.addStudent(student);
	}
	

}
