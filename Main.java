package com.codegnan.oopexamples;

public class Main {

	public static void main(String[] args) {
		person p=new person();
		p.setName("Raveendar");
		p.setAge(22);
		p.setHeight(5.7);
		p.getName();
		p.getAge();
		p.getHeight();
		p.introduce();
		//operational methods
		p.introduce();
		p.celebrateBirthday();
		p.isAdult();
		p.introduce();
		
		System.out.println(person.getspeciesName());
		System.out.println(p.getIdentification());
		

	}

}
