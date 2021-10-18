package com.springtask.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtask.api.controller.entities.Students;


@Service
public class StudentserviceImpl extends StudentService{
	
	
	List<Students> list;
	
	 public StudentserviceImpl() {
		list=new ArrayList<>();
		list.add(new Students(1,"developer",10));
		list.add(new Students(2,"tester",5));
		list.add(new Students(3,"operations",8));
		list.add(new Students(4,"deploymentTeam",6));
	}
	 @Override
		public List<Students> getStudents() {
			return list;
			//return super.getStudents();
		}
	
    @Override
	public Students getStudent(long studentid) {
		
		Students s=null;
		for(Students student:list)
		{
			if(student.getId()==studentid)
			{
				s=student;
				break;
			}
		}
		
		return s;
		//return super.getStudents(studentid);
	}
	@Override
	public Students addStudent(Students students) {
		list.add(students);
		return students;
	}


	

}
