package org.example.factory;

public class Sender extends Thread {
    private Store store;

    public Sender(Store store) {
        this.store = store;
    }


    @Override
    public void run() {
        String product = "";
        for (int i = 0; i < 10; i++) {
            product = store.sendProduct();
            System.out.println("Buyurtmachi " + product + "ni oldi");
            try {
                sleep(125);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
