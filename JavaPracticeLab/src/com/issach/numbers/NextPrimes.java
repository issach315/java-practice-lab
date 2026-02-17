package com.issach.numbers;

import java.util.Scanner;

public class NextPrimes {

    public  static boolean isPrime(int num){

        if(num <=1 ) return false;

        for(int i =2 ; i< num ;i++){
           if(num % i == 0){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number ");
        int n = scan.nextInt();

        System.out.println("How many next prime numbers to find:");
        int numberOfPrimesToFind = scan.nextInt();

        int primesFoundCount = 0;

        int currentNumber = n + 1;

        while (primesFoundCount < numberOfPrimesToFind) {

            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
                primesFoundCount++;
            }

            currentNumber++;
        }




    }
}
