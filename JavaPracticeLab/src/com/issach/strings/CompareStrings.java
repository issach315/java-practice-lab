package com.issach.strings;

import java.util.Scanner;

public class CompareStrings {

    public static void compareStringHelper(String str1, String str2) {

//        if (str1.equals(str2)) {
//            System.out.println("Both Strings are equal");
//        } else {
//            System.out.println("Both Strings are not equal");
//        }
//
//
//        // Compare ignoring case
//        if (str1.equalsIgnoreCase(str2)) {
//            System.out.println("Strings are equal when ignoring case.");
//        } else {
//            System.out.println("Strings are not equal even when ignoring case.");
//        }


        if(areStringsEqual(str1,str2)){
            System.out.println("Both Strings are equal");
        }else {
            System.out.println("Both Strings are not equal");
        }


    }


    public static boolean areStringsEqual(String str1, String str2) {


        if (str1.length() != str2.length()) {

            return false;

        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = scan.nextLine();
        System.out.println("Enter the second string");
        String str2 = scan.nextLine();
        compareStringHelper(str1, str2);
    }
}
