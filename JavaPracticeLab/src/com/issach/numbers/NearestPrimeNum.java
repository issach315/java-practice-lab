package com.issach.numbers;

import java.util.Scanner;

public class NearestPrimeNum {


    public static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in );

        System.out.println("Enter the n th number ");
        int n = scan.nextInt();

        int count =0;

        for(int i =n-1; i >2 ;i--){
            if(isPrime(i)){
                count++;
               if(count==3){
                   System.out.println("3rd previous prime is: " + i);
                   break;
               }

            }
        }

    }
}
