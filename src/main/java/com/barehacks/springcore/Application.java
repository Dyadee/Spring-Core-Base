package com.barehacks.springcore;

public class Application {

	public static void main(String[] args) {
		// create the object
		Coach thecoach = new TrackCoach();
				
		//use the object
		System.out.println(thecoach.getDailyWorkout());
		
	}

}
