package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("applicationContext.xml");
		Employee employee=context.getBean(Employee.class,"employee");
		Address address=employee.getAddress();
		employee.display();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
