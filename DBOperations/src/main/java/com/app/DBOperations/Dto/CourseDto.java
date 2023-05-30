package com.app.DBOperations.Dto;

import java.io.Serializable;

public class CourseDto implements Serializable
{
	private int id;
	
	private String credites;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCredites() {
		return credites;
	}

	public void setCredites(String credites) {
		this.credites = credites;
	}
	
	
}
