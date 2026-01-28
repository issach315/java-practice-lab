package com.issach.strings;

import java.util.Scanner;

public class CheckEmptyString {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("checking is string is empty or not");
        String str = scan.next();

        if(str.length()==0){
            System.out.println("Given String is empty");
        }else {
            System.out.println("Given String is not an empty");
        }
    }
}
