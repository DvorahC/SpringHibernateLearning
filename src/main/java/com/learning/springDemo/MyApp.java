package com.learning.springDemo;

public class MyApp {

    public static void main(String[] args) {
        //create the object
        //coding to the Coach interface so that it will work with any kind of COACH
        Coach theCoach = new TrackCoach();
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
