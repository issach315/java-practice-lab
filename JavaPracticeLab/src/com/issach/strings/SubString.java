package com.issach.strings;

import java.util.Scanner;

public class SubString {

    public static String subStringHelper(String str, int startIndex, int endIndex) {

        try {
            if (str == null) {
                return "String cannot be null";
            }

            StringBuilder result = new StringBuilder();

            for (int i = startIndex; i <= endIndex; i++) {
                result.append(str.charAt(i));
            }

            return result.toString();

        } catch (StringIndexOutOfBoundsException e) {
            return "Index out of range. Valid range is 0 to " + (str.length() - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = scan.nextLine();

        System.out.println("Enter start index");
        int startIndex = scan.nextInt();

        System.out.println("Enter end index");
        int endIndex = scan.nextInt();

        String result = subStringHelper(str, startIndex, endIndex);
        System.out.println(result);
    }
}
