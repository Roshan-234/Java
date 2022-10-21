package com.roshan;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
        person.setFirstName("Roshan");
        person.setLastName("Ghimire");
        person.setAge(22);

        System.out.println("Full name= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());
    }
}
