package com;

import java.util.concurrent.FutureTask;

public class MainTest {

    public static void main(String[] args) throws Exception {

        ThreadA A = new ThreadA();
        FutureTask<Integer> ft = new FutureTask<>(A);
        Thread tA = new Thread(ft);
        tA.start();

        ThreadB tb = new ThreadB();
        tb.start();

        ThreadC c = new ThreadC();
        Thread tc = new Thread(c);
        tc.start();

        tb.join();
        tc.join();
        System.out.println(ft.get());



    }
}
