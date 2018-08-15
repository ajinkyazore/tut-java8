package com.training.tutjava8.domain;

import java.time.LocalDate;

public class Person {
	private String name;
	private Integer age;
	private LocalDate dateOfBirth;
	public Person(String name, Integer age,LocalDate dateOfBirth) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
