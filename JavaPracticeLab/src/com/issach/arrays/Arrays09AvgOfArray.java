package com.issach.arrays;

public class Arrays09AvgOfArray {

    public static double getTheAvgOfArray(int[] arr) {

        int sum = 0;



        for (int ele : arr) {
            sum = sum + ele;
        }

        return sum/arr.length;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30};

        System.out.println("AVG OF ARRAY  " + getTheAvgOfArray(arr));
    }
}
