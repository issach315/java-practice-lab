package com.issach.patterns;

import java.util.Scanner;

public class Pattern04NumberHillPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows you want print ");
        int rows = scan.nextInt();

        System.out.println("enter the starting number ");
        int startNum = scan.nextInt();

        for (int i = 0,p=startNum; i < rows; i++,p++) {
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(p+" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" "+p);
            }
            System.out.println();
        }

    }
}
