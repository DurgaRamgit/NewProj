package com.ram.inject.difftypes;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DemoClient {
	
	public static void main(String[] args) {
FileSystemResource res=new FileSystemResource("src\\main\\webapp\\WEB-INF\\DemoDiftypesCfg.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Demo obj=(Demo)factory.getBean("db");
		 
		obj.sayHello();
		
	}

}
