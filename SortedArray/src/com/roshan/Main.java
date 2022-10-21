package com.roshan;

import java.util.Scanner;

import static com.roshan.SortedArray.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = getIntegers(6);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

}
