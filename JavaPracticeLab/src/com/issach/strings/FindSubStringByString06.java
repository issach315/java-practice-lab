package com.issach.strings;

import java.util.Scanner;

public class FindSubStringByString06 {


    public static String pullSubStringFromStringHelper(String str1, String str2) {

        if (str1 == null || str2 == null || str2.length() > str1.length()) {
            return "Invalid input";
        }

        for (int i = 0; i <= str1.length() - str2.length(); i++) {


            int j;

            for (j = 0; j < str2.length(); j++) {

                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }

            }

            if(j == str2.length()){
                return str2;
            }

        }


        return "Substring not found";

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you String ");
        String str1 = scan.nextLine();

        System.out.println("Enter subString you want pull-out from previous string ");
        String str2 = scan.nextLine();

        System.out.println( pullSubStringFromStringHelper(str1, str2));
    }
}
