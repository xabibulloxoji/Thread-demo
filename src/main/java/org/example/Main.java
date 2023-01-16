package org.example;

public class Main {
    public static void main(String[] args){

        Thread th1 = new Thread(new ThreadSleep(20), "1-thread");
        Thread th2 = new Thread(new ThreadSleep(10), "2-thread");
        th1.start();
        th2.start();


    }
}