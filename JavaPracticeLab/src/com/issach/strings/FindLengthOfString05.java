

package com.issach.strings;

import java.util.Scanner;

public class FindLengthOfString05 {


    public static int findLengthOfStringHelper(String str) {

        String noSpace = str.replaceAll("\\s+","");
        return noSpace.length();
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide the String here");
        String inputStr = scan.nextLine();

        System.out.println("Length of given string without spaces is  " + findLengthOfStringHelper(inputStr));

    }


}
