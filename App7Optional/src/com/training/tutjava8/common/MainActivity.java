package com.training.tutjava8.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.training.tutjava8.domain.Person;

public class MainActivity {
	public static void main(String[] args) {
        
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Steve Rogers",35));
        personList.add(new Person("Tony Stark",40));
        personList.add(new Person("Banner",38));
        
        Optional<Integer> maxAge=personList.stream().map(Person::getAge).reduce(Integer::max);
        Optional<Object> stringMatch = Arrays.asList().stream().filter(p->p.toString().equals("Hola")).findFirst();
        
			System.out.println("Max age :" + maxAge);
			System.out.println("String match on empty array :" + stringMatch);

	}
}