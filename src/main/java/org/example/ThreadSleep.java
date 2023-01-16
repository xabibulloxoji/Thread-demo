package org.example;

public class ThreadSleep implements Runnable{

    private int sleepDuration;

    public ThreadSleep(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.format("%sdan %d-habar%n", threadName, i);
            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e){
                System.out.println("Bizga halal berishdi...");
                System.exit(1);
            }
        }
    }
}
