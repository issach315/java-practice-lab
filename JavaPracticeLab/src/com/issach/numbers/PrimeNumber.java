package com.issach.numbers;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to check prime number or not ");
        int number = scan.nextInt();

        boolean isPrimeNumber = true;

        if (number <= 1) {
            isPrimeNumber = false;
        }else {
            for(int i =2 ;i<number ;i++){

                if(number% i ==0){

                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if(isPrimeNumber){
            System.out.println("Prime Number ");
        }else {
            System.out.println("Not A prime Number");
        }

    }
}
