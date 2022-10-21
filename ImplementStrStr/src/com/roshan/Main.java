package com.roshan;

public class Main {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        int res = strStr(haystack,needle);
        System.out.println(res);
    }
    public static int strStr(String haystack, String needle) {
        int result = 0;
        if (haystack.contains(needle)) {
            result = haystack.indexOf(needle);
        }
        return result;
    }

}
