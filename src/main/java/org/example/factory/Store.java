package org.example.factory;

public class Store {
    private String completeProduct;


    public void putProduct(String product){
        completeProduct = product;
    }

    public String sendProduct(){
        return completeProduct;
    }
}
