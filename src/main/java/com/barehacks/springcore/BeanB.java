package com.barehacks.springcore;

public class BeanB {
	
	private int age;
	
	public void setAge(int myAge) {
		System.out.println("Setting the age value using the setter method...");
		this.age = myAge;
		
	}
	
	public String getAge() {
		return "the value of age is " + age;
	}

}
