package com.learning.springDemo;

public class BaseBallCoach implements Coach{

    //define private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseBallCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 min batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
