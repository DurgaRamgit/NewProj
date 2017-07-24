package com.ram.spring1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DemoClient {
	
	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src\\main\\webapp\\WEB-INF\\Democfg.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("db");
		Demo refDemo=(Demo)obj;
		System.out.println(refDemo.generateWishMsg("ram"));
	}

}
