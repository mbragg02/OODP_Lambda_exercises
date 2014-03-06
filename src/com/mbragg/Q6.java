package com.mbragg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Bragg on 05/03/2014.
 * 6. Rewrite allMatches so it works on any List and associated Predicate, not just on Strings.
 * Verify that your examples from the previous question still work.
 *
 */
public class Q6 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("clock");
        words.add("bath");
        words.add("piano");
        words.add("bicycle");
        words.add("dog");
        System.out.println("words: " + words);

        List<String> shortWords = StringUtils.allMatchesGeneric(words, s -> s.length() < 4);
        System.out.println("shortWords: " + shortWords);

        List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
        System.out.println("wordsWithB: " + wordsWithB);

        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println("evenLengthWords: " + evenLengthWords);

    }
}
