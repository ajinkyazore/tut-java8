package com.training.tutjava8.common;

import java.util.ArrayList;
import java.util.List;

public class MainActivity {
 public static void main(String[] args) {
	List nameList = new ArrayList<>();
	nameList.add("Steve Rogers");
	nameList.add("Steve Rogers");
	nameList.add("Steve Rogers");
	
	nameList.forEach(System.out::println);
	
}
}
