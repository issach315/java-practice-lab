package com.issach.arrays;

import java.util.Arrays;

public class NearestPrimeArray {

    public static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int nearestPrimeNumner(int num) {
        if(isPrime(num)) return  num;

        int lower = num-1;
        int higher = num+1;

        while(true){
            if (lower >=2 && isPrime(lower)) return lower;
            if(isPrime(higher)) return higher;

            lower--;
            higher++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 14, 16, 18, 22};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nearestPrimeNumner(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
