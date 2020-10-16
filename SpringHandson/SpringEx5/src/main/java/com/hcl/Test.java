package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OwnerConfiguration.class);
		Owner owner=context.getBean(Owner.class,"owner");
		System.out.println("Enter the name,password and mobile number of the user ");
		owner.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
