package com.issach.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray08 {

    public static char[] getCharArrayHelper(String str) {
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = scan.nextLine();

        char[] result = getCharArrayHelper(str);
        System.out.println(Arrays.toString(result));
    }
}
