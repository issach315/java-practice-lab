package com.issach.strings;

import java.util.Scanner;

public class ToUpperCase11 {


    public  static  String convertStringToUpperCase(String str){

        if(str.length()==0){
           return str;
        }

        String result ="";

        for(int i =0; i<str.length();i++){

            char ch = str.charAt(i);
            if(ch >= 'a'&& ch<= 'z'){
                ch= (char) (ch-32);
            }
            result +=ch;

        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");

        String str = scan.nextLine();


        System.out.println(convertStringToUpperCase(str));
    }
}
