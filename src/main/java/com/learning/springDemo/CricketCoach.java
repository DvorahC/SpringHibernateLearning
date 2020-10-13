package com.learning.springDemo;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;

    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("we are inside the CricketCoach constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("we are inside the setter Method setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach : inside setter SetEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach : inside setter SetTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Play Cricket for 20 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
