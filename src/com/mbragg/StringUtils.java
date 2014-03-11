package com.mbragg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Michael Bragg on 05/03/2014.
 * String utilities class containing static methods related to string manipulation/comparison/printing
 */
public class StringUtils {

    public static int eChecker(String s1, String s2) {
//        if(s1.contains("e") && s2.contains("e") ||
//                !s1.contains("e") && !s2.contains("e")) {
//            return 0;
//        }

        if(s1.contains("e") && !s2.contains("e")) {

            return -1;
        } else if (!s1.contains("e") && s2.contains("e")){
            return 1;
        } else {
            return 0;
        }
    }

    public static void pArray(String[] someArrayToPrint) {
        System.out.println(Arrays.asList(someArrayToPrint));
    }

    public static String betterString(String s1, String s2, TwoStringPredicate x) {
        if (x.twoStringTest(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }

    // Generic two element Predicate. Custom interface "TwoelementPredicate"
    public static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> x) {
        if (x.twoTypeTest(t1, t2)) {
            return t1;
        } else {
            return t2;
        }
    }

    // String Predicate
    public static List<String> allMatches(List<String> stringList, Predicate<String> stringPredicate) {
        List<String> result = new ArrayList<>();
        stringList.stream().filter(stringPredicate::test).forEach(result::add);
        return result;
    }

    // Generic Predicate
    public static <T> List<T> allMatchesGeneric(List<T> genericList, Predicate<T> predicate) {
        ArrayList<T> result = new ArrayList<>();
        genericList.stream().filter(predicate::test).forEach(result::add);
        return result;
    }


    // Applies a given function to every item in a list of strings
    public static List<String> transformedList(List<String> stringList, Function<String, String> stringStringFunction) {
        List<String> result = new ArrayList<>();

        stringList.stream().map(stringStringFunction).forEach(result::add);
        return result;
    }

      // Applies a given function to every item in a generic list
    public static <T> List<T> transformedListGeneric(List<T> stringList, Function<T, T> stringStringFunction) {
        List<T> result = new ArrayList<>();

        stringList.stream().map(stringStringFunction).forEach(result::add);
        return result;
    }
}

