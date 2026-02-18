package com.issach.patterns;

import java.util.Scanner;

public class Pattern03DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows you want print");
        int rows = scan.nextInt();

        for (int i = 0; i < rows ; i++) {

            for (int j=i;j<rows;j++){
                System.out.print("  ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            for (int l=0;l<=i;l++){
                System.out.print("* ");
            }


            System.out.println();
        }
        for (int i = rows; i >=0  ; i--) {

            for (int j=i;j<rows;j++){
                System.out.print("  ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            for (int l=0;l<=i;l++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
