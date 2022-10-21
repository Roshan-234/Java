package com.roshan;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car honda = new Car();
        bmw.setModel("bmw11");
        honda.setModel("city");
        System.out.println("Model is " + bmw.getModel());
    }
}
