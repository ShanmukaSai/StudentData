package com.springtask.api.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springtask.api.controller.entities.Student;
import com.springtask.api.dao.StudentDao;


@Service
public class StudentserviceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	 public StudentserviceImpl() {
	}
	 @Override
		public List<Student> getStudent() {
			return studentDao.findAll();	
		}
	   
	@Override
	public Student getStudent(long studentid) {
		Optional<Student> student=studentDao.findById(studentid);
		if(student.isPresent())
		{
			return student.get();
		}
		else
			return null;
	}
	
	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

}
