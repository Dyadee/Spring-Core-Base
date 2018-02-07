package com.barehacks.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application_WithSpring {

	public static void main(String[] args) {
		// 1. load the spring configuration file
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml"); 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml"); 
		
		// 2. retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// 3. call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// 4.1 close the context this way if purely using the ClassPathXmlApplicationContext
		//((AbstractApplicationContext) context).close();
		
		// 4.2 close the context this way if already casted to AbstractApplicationContext
		context.close();
		

	}

}
