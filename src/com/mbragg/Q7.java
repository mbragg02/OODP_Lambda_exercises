package com.mbragg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Bragg on 06/03/2014.
 * Create a static method called transformedList. It should take a List of Strings and a Function<String,String> and
 * return a new List that contains the results of applying the function to each element of the original list.
 *
 */
public class Q7 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("clock");
        words.add("bath");
        words.add("piano");
        words.add("bicycle");
        words.add("dog");
        System.out.println("words: " + words);



        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        System.out.println("upperCaseWords: " + upperCaseWords);

        List<String> eyeWords =StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println("eyeWords: " + eyeWords);

        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        System.out.println("exciting words!: " + excitingWords);

    }
}
