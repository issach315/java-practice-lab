package com.issach.arrays;

public class ArrayLength01 {

    public static int findLengthOfArrayHelper(int[] arr) {

        return arr.length;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Length of the given Array " + findLengthOfArrayHelper(arr));

    }
}
