package com.springtask.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtask.api.controller.entities.Students;

public interface StudentDao extends JpaRepository<Students, Long>{

}
