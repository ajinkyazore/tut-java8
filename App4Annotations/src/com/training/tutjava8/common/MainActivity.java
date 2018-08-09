package com.training.tutjava8.common;

import org.springframework.lang.NonNull;

public class MainActivity {
	
	static @NonNull String str3;
	
@SuppressWarnings("unchecked")	
 public static void main(String[] args) {
	
	 String str1 = "";
	 String str2 = null;
	 
	  str3 = str2;
	  
	  System.out.println(str3);
}
}
