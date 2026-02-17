package com.issach.numbers;

import java.util.Scanner;

public class PrimenNumbersBtw1ToN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number ");
        int n = scan.nextInt();

        System.out.println("Print numbers from 1 to  " + n + " are");

        for (int num = 2; num <= n; num++) {

            boolean isPrimeNumber = true;

            for (int i = 2; i < num; i++) {

                if(num%i ==0){
                    isPrimeNumber =false;
                    break;
                }
            }

            if(isPrimeNumber){
                System.out.println("Prime number "+num);
            }

        }
        scan.close();
    }
}
