package com.springtask.api.controller.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	private long id;
	private String name;
	private long standard;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getStandard() {
		return standard;
	}
	public void setStandard(long standard) {
		this.standard = standard;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(long id, String name, long standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}

}
