package com.issach.numbers;

import java.util.Scanner;

public class LargestPrimeLessThanN03 {

    public  static  boolean isPrime(int num ){

        if(num<=1) return false;

        for(int i =2 ; i < num ; i++){

            if(num % i == 0){
                return false;

            }
        }

        return  true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number ");
        int n = scan.nextInt();

       for(int i = n-1 ; i >2 ;i--){
           if(isPrime(i)){
               System.out.println("Largest prime number less than " + n + " is " + i);
               break;
           }

       }
    }
}
