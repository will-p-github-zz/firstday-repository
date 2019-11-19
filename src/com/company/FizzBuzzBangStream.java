package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class FizzBuzzBangStream {
    public static Stream<String> create() {
        String[] arr = new String[100];
        for (int i = 0; i < 100; ++i) {
            arr[i] = i;
        }
        return Arrays.stream(arr);
    }

    public static void main(String[] args) {
        FizzBuzzBangStream.create().forEach(System.out::println);
    }
}