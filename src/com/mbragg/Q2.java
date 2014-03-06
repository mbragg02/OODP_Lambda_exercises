package com.mbragg;

import java.util.Arrays;

/**
 * Created by Michael Bragg on 05/03/2014.
 * Q2. For the last sorting example (strings with "e" first), move the logic that computes the number
 * to a separate static method.
 *
 */
public class Q2 {

    public static void main(String[] args) {
        String[] names = {"mike", "sam", "aimee", "john", "michael", "mb"};

        // Print original array of names
        StringUtils.pArray(names);

        // Strings that contain “e” first, everything else second.
        Arrays.sort(names, StringUtils::eChecker);
        StringUtils.pArray(names);
    }


}


