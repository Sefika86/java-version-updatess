package com.company.tasks;

import java.util.Arrays;
import java.util.List;

public class PrintNumberOfCharacters {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(str -> str.length())  //Lambda can be replaced with method reference (String::length)
                .forEach(System.out::println);
    }
}

/*
Given a list of words, print the number of characters for each word.
List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER")
 */