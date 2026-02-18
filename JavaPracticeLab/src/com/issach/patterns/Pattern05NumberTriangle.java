package com.issach.patterns;

import java.util.Scanner;

public class Pattern05NumberTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row count you want to print");
        int rows = scan.nextInt();

        System.out.println("Enter the number you want print from");
        int num = scan.nextInt();

        for (int i = 0; i <rows ; i++) {
            for (int j = i,p=num; j < rows; j++,p++) {
                System.out.print(" "+p);
            }
            System.out.println();
        }
    }
}
