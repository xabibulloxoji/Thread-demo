package org.example.factory;

public class Manufacture {

    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Factory factory = new Factory(store);
        Sender sender = new Sender(store);

        System.out.println("Ish jarayoni boshlandi...");

        factory.start();
        sender.start();
    }
}
