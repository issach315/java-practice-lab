package com.issach.arrays;

public class LargeElemetFromArray05 {

    public static int findTheLargeEleHelper(int[] arr){

        int largeEle =0;

        for(int ele: arr){
            if(largeEle < ele){
                largeEle=ele;
            }
        }

        return largeEle;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};

        System.out.println("Large element in array : "+findTheLargeEleHelper(arr));

    }
}
