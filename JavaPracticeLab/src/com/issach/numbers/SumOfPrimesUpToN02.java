package com.issach.numbers;

import java.util.Scanner;

public class SumOfPrimesUpToN02 {


    public  static  boolean isPrime(int num){

        if(num<=1 ) return  false;

        boolean isPrimeNumber = true;

        for (int i =2 ; i < num ; i++ ){
            if(num % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number");
        int n = scan.nextInt();

        int sum =0 ;

        for(int i = 2 ; i <= n ;i++){
            if (isPrime(i)) {
                System.out.println("Prime Number "+i);
                sum += i;

            }
        }

        System.out.println( "Sum of the n prime numbers "+ sum);

    }
}
