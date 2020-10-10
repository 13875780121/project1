package com;

public class ThreadC implements Runnable {
    @Override
    public void run() {
        for (int i = 0 ;i <100; i++){
            System.out.println("b");
        }
    }
}
