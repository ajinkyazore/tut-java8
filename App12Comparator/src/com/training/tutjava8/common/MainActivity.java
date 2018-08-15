package com.training.tutjava8.common;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.training.tutjava8.domain.Person;

public class MainActivity {
	public static void main(String[] args) {
		// lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);
 
        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
        
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Steve","Rogers",35));
        personList.add(new Person("Tony","Stark",40));
        personList.add(new Person("Bruce","Banner",38));
        personList.add(new Person("Bruce","Wayne",38));

        Comparator<Person> firstNameThenByLastName = Comparator.comparing(Person::getFirstName)
        														.thenComparing(Person::getLastName);
        System.out.println("Sorting by first name then by last name");
        personList.sort(firstNameThenByLastName);
        personList.forEach(System.out::println);
        
        System.out.println("Sorting by last name then by first name");
        Comparator<Person> reversed = firstNameThenByLastName.reversed();
        personList.sort(reversed);
        personList.forEach(System.out::println);
	}
}

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);
 
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}	
