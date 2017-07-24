package com.ram.bean.collabaration;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class DemoClient {
	public static void main(String[] args) 
	{
		FileSystemResource res=new FileSystemResource("src\\main\\webapp\\WEB-INF\\ColabDemocfg.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("db");
		DemoBean refDemo=(DemoBean)obj;
		System.out.println(refDemo.sayHello("babu"));
	}

}
