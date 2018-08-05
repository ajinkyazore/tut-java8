package com.training.tutjava8.common;
import java.util.List;
import java.util.ArrayList;

public class MainActivity {
 public static void main(String[] args) {
	
	 List usernames = new ArrayList<>();
	 
	 usernames.add("Captain America");
	 usernames.add("Tony Stark");
	 usernames.add("Jethya");
	 
	 usernames.forEach(System.out::println);
}
}
