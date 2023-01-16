package org.example.factory;

public class Factory extends Thread{

    private Store store;

    public Factory(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            store.putProduct(i + "-product");
            System.out.println("Korxona " + i + "-mahsulotni omborga joyladi");
            try {
                sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
}
