package com.issach.arrays;

public class Arrays08SumOfAllEle {

    private static int sum;

    public static int sumOfArrHelper(int [] arr){

        int sum = 0;

        for(int ele :arr){

            sum+= ele;
        }

        return sum;

    }

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5};

        int sumOfArr = sumOfArrHelper(arr);

        System.out.println("Sum of an array "+sumOfArr);
    }
}
