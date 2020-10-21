package com.hcl;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course1=context.getBean("courses1",Course.class);
		Course course2=context.getBean("courses2",Course.class);
		Course course3=context.getBean("courses3",Course.class);
		course1.display();
		course2.display();
		course3.display();
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
