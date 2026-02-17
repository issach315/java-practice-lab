package com.issach.numbers;

import java.util.Scanner;

public class PrimeNumbersInRange01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number to check primenumber to nth numer");
        int n = scan.nextInt();

        for(int num =2 ; num<= n;num++){

           boolean isPrimeNumber = true;

           for (int i =2 ; i< num ; i++){
                if(num% i == 0){
                    isPrimeNumber = false;
                    break;
                }
           }

           if (isPrimeNumber){
               System.out.println("Prime Number "+num);
           }
        }


    }
}
