package com.mendes;

/**
 * Created by mendesmustafa on 15.01.2021.
 */

public class Number {

    public int number;
    private boolean isNumber = false;

    public synchronized void send(int number) {
        while (isNumber == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isNumber = true;
        this.number = number;
        notify();
    }

    public synchronized int receive() {
        while (isNumber == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isNumber = false;
        notify();
        return number;
    }
}
