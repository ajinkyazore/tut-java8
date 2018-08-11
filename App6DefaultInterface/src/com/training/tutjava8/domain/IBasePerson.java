package com.training.tutjava8.domain;

public interface IBasePerson {
	
	default <T> void printToStringHashCodeDetails(T t){
		System.out.println(t.toString()+t.hashCode());
	}
	
}
