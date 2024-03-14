package org.demo;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        getAverage(Arrays.asList(6,3,1,3,5,10,9));
        convertCase(Arrays.asList("Raj","ANu","Bheem","Raghu","JeeVa","ManU"));
    }

    // Write a Java program to calculate the average of a list of integers using streams.
    public static void getAverage(List<Integer> list){
        Double average = list
                .stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
        System.out.println("Average :: "+average);
    }

    // Write a Java program to convert a list of strings to uppercase or lowercase using streams.
    public static void convertCase(List<String> stringList){
        // to uppercase
        List<String> upperCaseList = stringList
                .stream()
                .map(String :: toUpperCase)
                .toList();
        System.out.println("UpperCase Strings :: "+upperCaseList);

        List<String> lowerCaseList = stringList
                .stream()
                .map(String :: toLowerCase)
                .toList();
        System.out.println("LowerCase Strings :: "+lowerCaseList);
    }
}