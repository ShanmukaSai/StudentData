package com.springtask.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtask.api.controller.entities.Student;

public interface StudentDao extends JpaRepository<Student, Long>{

}
