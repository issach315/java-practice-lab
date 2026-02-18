package com.issach.strings;

import java.util.Scanner;

public class ToLowerCase10 {

    public static String toLowerCaseHelper(String str) {

        if (str.length() == 0) {
            return str;
        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result += ch;

        }


        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to convert into lowercase");

        String inputStr = scan.nextLine();

        String result = toLowerCaseHelper(inputStr);

        System.out.println("Reslut : " + result);


    }
}
