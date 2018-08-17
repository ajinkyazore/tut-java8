package com.training.tutjava8.common;

import java.util.HashMap;
import java.util.Map;

import com.training.tutjava8.domain.Person;

public class MainActivity {
	public static void main(String[] args) {
        
        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(1,new Person("Steve","Rogers",35));
        personMap.put(2,new Person("Tony","Stark",40));
        personMap.put(3,new Person("Bruce","Banner",38));
        personMap.put(4,new Person("Bruce","Wayne",38));

        Person defaultPerson = new Person("Thanos","Titan",100);
        System.out.println(personMap.getOrDefault(12, defaultPerson));
        
        Person newPerson = new Person("Loki","Odinson",30);
        personMap.putIfAbsent(1, newPerson);
        
        System.out.println(personMap.get(1));
	}
}	
