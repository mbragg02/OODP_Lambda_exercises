package com.mbragg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Bragg on 06/03/2014.
 *
 *
 */
public class Q8 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("clock");
        words.add("bath");
        words.add("piano");
        words.add("bicycle");
        words.add("dog");
        System.out.println("words: " + words);



        List<String> upperCaseWords = StringUtils.transformedListGeneric(words, String::toUpperCase);
        System.out.println("upperCaseWords: " + upperCaseWords);

        List<String> eyeWords =StringUtils.transformedListGeneric(words, s -> s.replace("i", "eye"));
        System.out.println("eyeWords: " + eyeWords);

        List<String> excitingWords = StringUtils.transformedListGeneric(words, s -> s + "!");
        System.out.println("exciting words!: " + excitingWords);
    }
}
