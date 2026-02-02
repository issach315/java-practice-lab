package com.issach.arrays;

public class Arrays10CopyArray {

    public static int[] copyArray(int[] source) {

        if (source == null) {
            return null;
        }

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        return destination;
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = copyArray(arr1);

        for (int value : arr2) {
            System.out.print(value + " ");
        }
    }
}
