package org.example;

public class Simple implements Runnable {
    public static void main(String[] args) {
        Simple main = new Simple();
        Thread thread = new Thread(main);
        thread.start();
        try{
            Thread.sleep(2000);
            thread.interrupt();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String[] array = {"Hello world", "Hello world", "Hello world", "Hello world"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Halaqit berishdi!!!");
                return;
            }
        }
    }
}
