package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	

			CourseList courselist=new CourseList();
			
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
			Course course1=context.getBean("courses1",Course.class);
			Course course2=context.getBean("courses2",Course.class);
			Course course3=context.getBean("courses3",Course.class);
			courselist.insert(course1);
			courselist.insert(course2);
			courselist.insert(course3);
			courselist.discount();
			
			((ClassPathXmlApplicationContext)context).close();
			
		}
}
