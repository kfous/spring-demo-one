package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    //CONSTRUCTOR DEPENDENCY INJECTION
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
