package com.mbragg;


import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
	// 1. Create an array containing some Strings. Sort the array by:

        String[] names = {"mike", "sam", "aimee", "john", "michael", "mb"};

        // Print original array of names
        StringUtils.pArray(names);

        // sort by length. shortest to longest
        Arrays.sort(names, (String s1, String s2) -> s1.length() - s2.length());
        StringUtils.pArray(names);

        // reverse length. longest to shortest
        Arrays.sort(names, (s1, s2) -> s2.length() - s1.length());
        StringUtils.pArray(names);

        // first character
        Arrays.sort(names, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        StringUtils.pArray(names);



        // Strings that contain “e” first, everything else second.
        Arrays.sort(names, (s1, s2) -> StringUtils.eChecker(s1, s2));
        StringUtils.pArray(names);
    }


}
