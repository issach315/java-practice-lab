package com.issach.patterns;

import java.util.Scanner;

public class SquarePattern01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Columns");
        int cols = scan.nextInt();

        System.out.println("Enter the number of Rows");
        int rows = scan.nextInt();

        for(int i =1 ;i<=rows;i++){
            for (int j=1 ;j<=cols ;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}