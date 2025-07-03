package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {


    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D", "E")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(flatList); // Output: [A, B, C, D, E]

    }
}
