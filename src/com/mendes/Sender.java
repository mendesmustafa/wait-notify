package com.mendes;


/**
 * Created by mendesmustafa on 15.01.2021.
 */

public class Sender implements Runnable {

    private Number number;

    public Sender(Number number) {
        super();
        this.number = number;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                number.send(i);
                System.out.println("sender number:" + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
