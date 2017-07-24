package com.ram.bean.collabaration;

import java.util.Date;

public class DemoBean implements Demo 
{
	String name1;
	int age;
	Date d;
	TestBean tb;

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hai "+name+"  Good morning "+name1+" age:"+age+" date :"+d+"test bean   :"+tb;
	}

}
