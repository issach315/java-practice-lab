package com.issach.arrays;

public class ArrayFirstLast04 {

    public static void main(String[] args) {

        int[] arr = {10, 30, 50, 70, 90};

        int firstEle = arr[0];               // First element
        int lastEle = arr[arr.length - 1];   // Last element

        System.out.println("First index element is: " + firstEle);
        System.out.println("Last index element is: " + lastEle);
    }
}
