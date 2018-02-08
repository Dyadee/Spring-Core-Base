package com.barehacks.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application_SetterDemo {

	public static void main(String[] args) {
		//load the spring configuration file
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		//retrieve the bean from the spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call the method of the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		//call the methods that use the literal values
		
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		//close the context
		context.close();
		

	}

}
