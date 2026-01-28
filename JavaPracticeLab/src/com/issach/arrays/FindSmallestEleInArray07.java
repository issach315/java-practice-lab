package com.issach.arrays;

public class FindSmallestEleInArray07 {

    public static int findSmallEleInArrayHelper(int[] arr){

        int smallestEle =arr[0];

        for(int ele: arr){
            if(smallestEle > ele){
                smallestEle =ele;
            }
        }

        return smallestEle;
    }


    public static void main(String[] args) {

        int arr[] = new int[]{10,44,33,12,89,9,27,46,86,2,4,56,40,47,48,49,43,42,87,86,97,1};

        System.out.println("SMALLEST ELEMENT IN ARRAY : "+findSmallEleInArrayHelper(arr));
    }
}
