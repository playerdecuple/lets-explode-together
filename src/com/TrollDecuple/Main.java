package com.TrollDecuple;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new ExplodeCore(), 0, 1);

    }

}

class ExplodeCore extends TimerTask {
    @Override
    public void run() {

        int i = 0;
        while (true) {
            i++;
            System.out.println(i);

            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new ExplodeCore(), 0, 1);

            /*
            Testing Code
            if (i >= 30) System.exit(-1);
             */
        }

    }
}
