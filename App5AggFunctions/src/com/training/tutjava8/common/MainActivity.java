package com.training.tutjava8.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.training.tutjava8.domain.Person;

public class MainActivity {
	public static void main(String[] args) {
        
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Steve Rogers",35));
        personList.add(new Person("Tony Stark",40));
        personList.add(new Person("Banner",38));
        personList.add(new Person("Romanoff",30));
        personList.add(new Person("Pepper Potts",29));

        //sum operation 
        System.out.println(personList.stream()
        	            			 .mapToInt(Person::getAge)
        	            			 .sum());
        
        //max operation
        System.out.println(personList.stream()
        	            			 .max((person1, person2) -> person1.getAge() > person2.getAge() ? 1 : -1));
        
	    //min operation
	    System.out.println(personList.stream()
	    	            			 .min((person1, person2) -> person1.getAge() < person2.getAge() ? 1 : -1));
	    
        //count operation
        System.out.println(personList.stream()
        	            .filter(person -> person.getAge() < 18)
        	            .count());
        
	}
}	
