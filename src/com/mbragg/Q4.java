package com.mbragg;

/**
 * Created by Michael Bragg on 05/03/2014.
 *
 */
public class Q4 {

    public static void main(String[] args) {

        System.out.println(StringUtils.betterEntry("michael", "sam", (t1,t2) -> t1.toString().length() < t2.toString().length()));


    }
}
