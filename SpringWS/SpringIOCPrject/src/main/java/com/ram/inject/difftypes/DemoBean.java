package com.ram.inject.difftypes;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class DemoBean implements Demo {
	
	String name;
	int age;
	int marks[];
	String subjects[];
	
	List names;
	Set phones;
	Map capitals;
	Properties faculties;

	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public void setNames(List names) {
		this.names = names;
	}

	public void setPhones(Set phones) {
		this.phones = phones;
	}

	public void setCapitals(Map capitals) {
		this.capitals = capitals;
	}

	public void setFaculties(Properties faculties) {
		this.faculties = faculties;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Name  :"+name);
		System.out.println("Age  :"+age);
		for(int i=0;i<subjects.length;i++)
		{
			System.out.print(subjects[i]+"   ");
		}
		System.out.println();
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"   ");
		}
		System.out.println("");
		
		System.out.println("names  :"+names.toString());
		System.out.println("Phones :"+phones.toString());
		System.out.println("Capitals :"+capitals.toString());
		System.out.println("Faculties :"+faculties.toString());
		return "Good Morning"+name;
	}

}
