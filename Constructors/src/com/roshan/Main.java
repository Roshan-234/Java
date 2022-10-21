package com.roshan;

public class Main {

    public static void main(String[] args) {
	    Account tomsAccount = new Account("12345", 0.00 , "Tom Hardy", "tom@gmail.com", "9876543210");

//        tomsAccount.setNumber("12345");
//        tomsAccount.setBalance(0.00);
//        tomsAccount.setCustomerName("Tom Hardy");
//        tomsAccount.setCustomerEmail("tom@gmail.com");
//        tomsAccount.setCustomerPhone("9876543210");
//        System.out.println(tomsAccount.getCustomerName());
//        System.out.println(tomsAccount.getBalance());
//
//        tomsAccount.withdrawal(100.0);
//
//        tomsAccount.deposit(50.0);
//        tomsAccount.withdrawal(100.0);
//
//        tomsAccount.deposit(51.0);
//        tomsAccount.withdrawal(100.0);
//
//        Account rosAccount = new Account("Roshan","ro@gmail.com","9876543210");
//        System.out.println(rosAccount.getNumber() + " name " + rosAccount.getCustomerName());

        VipCustomer roshan = new VipCustomer("Roshan Ghimire",1000,"ro@gmail.com");
        System.out.println("name= " + roshan.getName() + " has credit limit of " + roshan.getCreditLimit());
   }
}
