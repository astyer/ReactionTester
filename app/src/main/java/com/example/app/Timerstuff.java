package com.example.app;

import java.util.Timer;
import java.util.TimerTask;

public class Timerstuff {

    int secondsPassed = 0;
    Timer timer = new Timer();
    int r = (int)(Math.random() * 15);
    TimerTask task = new TimerTask() {
        public void run()
        {
            secondsPassed++;
            if(secondsPassed == r)
            {
                timer.cancel();
            }
        }
    };

    public void start()
    {
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public boolean stopped()
    {
        if(secondsPassed == r)
        {
            return true;
        }
        return false;
    }

}