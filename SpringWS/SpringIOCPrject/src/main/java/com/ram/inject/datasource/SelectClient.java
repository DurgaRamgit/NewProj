package com.ram.inject.datasource;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SelectClient 
{
	public static void main(String[] args) {
		
		FileSystemResource res=new FileSystemResource("src\\main\\webapp\\WEB-INF\\SelectCfg.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Select obj=(Select)factory.getBean("sb");
		System.out.println("Emp name: "+obj.fetchName(1));
		System.out.println("Emp Salary :"+obj.fetchSalary(1));
	}

}
