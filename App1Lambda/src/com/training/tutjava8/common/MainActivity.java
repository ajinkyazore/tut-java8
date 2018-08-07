package com.training.tutjava8.common;

import java.util.ArrayList;
import java.util.List;

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
        personList.add(new Person("Steve Rogers",35));
        personList.add(new Person("Tony Stark",40));
        personList.add(new Person("Banner",38));
        
        System.out.println(personList.stream().mapToInt(Person::getAge).sum());
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
