package org.example.factory;

public class Store {
    private String completeProduct;

    private boolean isComplete = false;


    public synchronized void putProduct(String product) {
        while (isComplete) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        completeProduct = product;
        isComplete = true;
        notifyAll();
    }

    public synchronized String sendProduct() {
        while (!isComplete) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isComplete = false;
        notifyAll();
        return completeProduct;
    }
}
