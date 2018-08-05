package com.training.tutjava8.common;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainActivity {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	//Predicate for number
	System.out.println("Evaluate all numbers");
	eval(list,n->true);
	
	System.out.println("Evaluate Even numbers");
	eval(list,n->n%2==0);
	
	System.out.println("Print Numbers greater than 3");
	eval(list,n->n>3);
}

static <T> void eval(List<T> integerList,Predicate<T> numberPredicate){
	integerList.forEach(n->{if(numberPredicate.test(n)){System.out.print(n+",");}});
	System.out.println("\n*****************");
}
}
