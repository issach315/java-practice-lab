package com.issach.numbers;

import java.util.Scanner;

public class PrimeCountBtwRange {


    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        boolean isPrimeNumber = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the left number");
        int left = scan.nextInt();

        System.out.println("Enter the right number");
        int right = scan.nextInt();


        int count = 0;

        for (int i = left; i <= right; i++) {

            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Prime number count " + count);


    }
}
