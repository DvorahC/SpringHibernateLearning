package com.learning.springDemo;

public class TrackCoach implements Coach {

    //we also want TrackCoach to use FortuneService
    //lets do a dependency injection for that

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    public TrackCoach(){

    }

    @Override
    public String getDailyWorkout() {
        return "Run a 5K ";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It" + fortuneService.getFortune();
    }
}
