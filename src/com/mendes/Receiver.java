package com.mendes;


/**
 * Created by mendesmustafa on 15.01.2021.
 */

public class Receiver implements Runnable {

    private Number number;

    public Receiver(Number number) {
        super();
        this.number = number;
    }

    @Override
    public void run() {
        int firstNumber = 0;
        try {
            for (int i = 0; i <= 5; i++) {
                firstNumber = number.receive();
                System.out.println("receive number: " + firstNumber);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
