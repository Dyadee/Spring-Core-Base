package com.barehacks.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		BeanA beanA = context.getBean("BeanA", BeanA.class);
		System.out.println(beanA.greetingsFromA());
		
		context.close();

	}

}
