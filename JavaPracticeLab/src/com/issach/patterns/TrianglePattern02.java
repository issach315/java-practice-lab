package com.issach.patterns;

import java.util.Scanner;

public class TrianglePattern02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the how many rows you want print ");
        int rows = scan.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <=i  ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
