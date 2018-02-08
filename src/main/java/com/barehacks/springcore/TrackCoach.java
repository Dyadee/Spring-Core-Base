package com.barehacks.springcore;

public class TrackCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for the dependency injection
	public TrackCoach(FortuneService myfortuneService) {
		this.fortuneService = myfortuneService;

	}
		
	public TrackCoach() {}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}

}
