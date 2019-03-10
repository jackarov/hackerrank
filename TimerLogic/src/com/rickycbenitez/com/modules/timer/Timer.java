package com.rickycbenitez.com.modules.timer;


public class Timer {

    private int minutes;

    public Timer(int minutes) throws InterruptedException {

        if(minutes != 0){
        this.minutes = minutes;

        int timet = minutes * 60; // Convert to seconds
        long delay = timet * 1000;
        do {
            minutes = timet / 60;
            int seconds = timet % 60;
            System.out.println(minutes + " minute(s), " + seconds + " second(s)");
            Thread.sleep(1000);
            timet = timet - 1;
            delay = delay - 1000;
        }
        while (delay != 0);
        System.out.println("Time's Up!");

    }
    }

}
