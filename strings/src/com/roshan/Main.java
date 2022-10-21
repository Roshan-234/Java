package com.roshan;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double thirdValue = (firstValue + secondValue) * 100.00d;
        double remainder = thirdValue % 40.00d;
        boolean value = (remainder == 0)?true:false;
        System.out.println(value);

        if(!value){
            System.out.println("Got some remainder");
        }

     }
}
