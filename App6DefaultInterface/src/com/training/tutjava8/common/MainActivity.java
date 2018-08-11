package com.training.tutjava8.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.training.tutjava8.domain.FemalePerson;
import com.training.tutjava8.domain.IBasePerson;
import com.training.tutjava8.domain.MalePerson;

public class MainActivity {
	
	void printPersonList(){
        List<IBasePerson> personList = new ArrayList<>();
        personList.add(new MalePerson("Steve Rogers"));
        personList.add(new FemalePerson("Romanoff"));
        personList.add(new FemalePerson("Pepper Potts"));
        personList.forEach(p -> p.printToStringHashCodeDetails(p));
	}
	
	public static void main(String[] args) {
        MainActivity ma= new MainActivity();
        ma.printPersonList();

        
	}
}	
