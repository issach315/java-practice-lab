package com.issach.patterns;

import java.util.Scanner;

public class TriangleSideMountain04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows you want print ");
        int rows = scan.nextInt();

        for (int i = 0; i <= rows; i++) {

            for (int j = 0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {

            for (int j=i ; j<rows ;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
