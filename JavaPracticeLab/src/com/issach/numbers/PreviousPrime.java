package com.issach.numbers;

import java.util.Scanner;

public class PreviousPrime {


    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }

        for(int i =2 ; i< num ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int inputNumber = scan.nextInt();

        System.out.println("How many previous prime numbers to find:");
        int numberOfPrimesToFind = scan.nextInt();

        int primesFoundCount = 0;
        int currentNumber = inputNumber - 1;

        while(currentNumber >=2 && primesFoundCount <numberOfPrimesToFind){

           if (isPrime(currentNumber)){
               System.out.println(currentNumber);
               primesFoundCount++;
           }
            currentNumber--;

        }




    }
}
