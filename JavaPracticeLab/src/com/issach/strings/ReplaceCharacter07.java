package com.issach.strings;

import java.util.Scanner;

public class ReplaceCharacter07 {

    public static StringBuilder getUpdatedStrng(String str, char newChar, char oldChar) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)==oldChar){
                result.append(newChar);
            }else{
                result.append(str.charAt(i));
            }
        }


        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = scan.nextLine();

        System.out.println("Enter new char you want replace");
        char newChar = scan.next().charAt(0);


        System.out.println("Enter char you want replace with new char ");

        char oldChar = scan.next().charAt(0);

        System.out.println("Updated String is :  " + getUpdatedStrng(str, newChar, oldChar));


    }
}
