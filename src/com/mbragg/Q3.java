package com.mbragg;

/**
 * Created by Michael Bragg on 05/03/2014.
 * Q3. Create a class with a static method called betterString.
 * This method should take two Strings and a lambda as its arguments.
 * This lambda states whether the first of the two strings is better.
 * The method should return the better string; i.e., if the lambda returns true the method should return the first string,
 * otherwise it should return the second string.
 * For the lambda, define an interface called TwoStringPredicate with a method that takes
 * two Strings and returns true if the first is better than the second, false otherwise.
 *
 */
public class Q3 {


    public static void main(String[] args) {

        System.out.println(StringUtils.betterString("michael", "sam", (s1,s2) -> s1.length() < s2.length()));


    }
}
