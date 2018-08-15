package com.training.tutjava8.common;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
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
        personList.add(new Person("Steve Rogers",38,LocalDate.of(1980, Month.AUGUST, 12)));
        personList.add(new Person("Tony Stark",37,LocalDate.of(1981, Month.JANUARY, 21)));
        personList.add(new Person("Banner",35,LocalDate.of(1982, Month.DECEMBER, 21)));
        System.out.println(personList.stream().map(p->new Person(p.getName(),p.getAge()+10,LocalDate.now())).collect(Collectors.toList()));
        System.out.println(personList.stream().mapToInt(Person::getAge).sum());
        
        personList.stream().forEach(
                p -> {
                    Period period = Period.between(p.getDateOfBirth(), LocalDate.now());
                    System.out.println(p.getName() + " was born " +
                            period.get(ChronoUnit.YEARS) + " years and " + 
                            period.get(ChronoUnit.MONTHS) + " months ago " + 
                            "[" + p.getDateOfBirth().until(LocalDate.now(), ChronoUnit.MONTHS) 
                            + " months]"
                            );
                    
                });
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
