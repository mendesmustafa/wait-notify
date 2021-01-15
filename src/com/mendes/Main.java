package com.mendes;

public class Main {

    public static void main(String[] args) {

        Number number = new Number();
        Thread sender = new Thread(new Sender(number));
        Thread receiver = new Thread(new Receiver(number));
        sender.start();
        receiver.start();
    }
}
