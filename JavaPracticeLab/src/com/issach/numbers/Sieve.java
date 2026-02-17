package com.issach.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

    public static void sieve(int num) {

        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {

                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.println("Prime Number " + i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find primes up to N:");

        int n = scan.nextInt();
        sieve(n);
    }
}
