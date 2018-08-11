package com.training.tutjava8.domain;

public class MalePerson implements IBasePerson {

	private String name;

	public MalePerson(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
