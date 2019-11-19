package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

 /*   public static String[] push(String str, String arr[], int n) {
        String newarr[] = new String[n+1];
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        newarr[n] = str;
        return newarr;
    }*/

    public static void main(String[] args) {
	    for (int i = 1; i <= 400; i++) {
	        LinkedList<String> FIZZBUZZ = new LinkedList<String>();
	        boolean isFezz = false;
	        if (i % 3 == 0) {
	            FIZZBUZZ.add("Fizz");
            }
            if (i % 13 == 0) {
                FIZZBUZZ.add("Fezz");
                isFezz = true;
            }
            if (i % 5 == 0) {
                FIZZBUZZ.add("Buzz");
            }
            if (i % 7 == 0) {
                FIZZBUZZ.add("Bang");
            }
            if (i % 11 == 0) {
                FIZZBUZZ.clear();
                if (isFezz) {
                    FIZZBUZZ.add("Fezz");
                }
                FIZZBUZZ.add("Bong");
            }
	        if (FIZZBUZZ.size() == 0) {
	            System.out.println(i);
            } else {
	            String str = "";
	            if (i % 17 == 0) {
                    while (FIZZBUZZ.size() > 0) {
                        str += FIZZBUZZ.removeLast();
                    }
                } else {
                    while (FIZZBUZZ.size() > 0) {
                        str += FIZZBUZZ.removeFirst();
                    }
                }
	            System.out.println(str);
            }


 /*           String[] FIZZBUZZ = {};

	        if (i % 3 == 0) {
	            FIZZBUZZ = push("Fizz", FIZZBUZZ, FIZZBUZZ.length);
            }

	        if (i % 5 == 0) {
                FIZZBUZZ = push("Buzz", FIZZBUZZ, FIZZBUZZ.length);
            }

	        if (i % 7 == 0) {
                FIZZBUZZ = push("Bang", FIZZBUZZ, FIZZBUZZ.length);
            }

	        if (i % 11 == 0) {
                FIZZBUZZ = push("Bong", FIZZBUZZ, FIZZBUZZ.length);
            }

	        if (i % 13 == 0) {
                FIZZBUZZ = push("Fezz", FIZZBUZZ, FIZZBUZZ.length);
            }

	        if (FIZZBUZZ.length == 0) {
	            System.out.println(i);
            } else {
	            System.out.println(Arrays.toString(FIZZBUZZ));
            }*/
        }
    }
}
