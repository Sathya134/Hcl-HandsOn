package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		User user=context.getBean(User.class,"user");
		user.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
