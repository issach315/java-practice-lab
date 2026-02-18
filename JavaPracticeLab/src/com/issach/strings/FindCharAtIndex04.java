package com.issach.strings;

import java.util.Scanner;

public class FindCharAtIndex04 {

    public static char getCharFromIndexHelper(String str, int index) {

        char ch =' ';

        for (int i = 0; i < str.length(); i++) {

            if(index==i){
                ch= str.charAt(i);
                break;
            }
        }

        return ch;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str1 = scan.nextLine();


        System.out.println("Enter the index");
        int index = scan.nextInt();


        System.out.println("Character at given index was  : "+getCharFromIndexHelper(str1, index));
    }
}
