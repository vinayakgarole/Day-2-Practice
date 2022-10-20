package com.bridgelabz;

import java.util.Scanner;

public class SingleDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("Entered number is zero.");
        } else if (a == 1) {
            System.out.println("Entered number is one.");
        } else if (a == 2) {
            System.out.println("Entered number is two.");
        } else if (a == 3) {
            System.out.println("Entered number is three.");
        } else if (a == 4) {
            System.out.println("Entered number is four.");
        } else if (a == 5) {
            System.out.println("Entered number is five.");
        } else if (a == 6) {
            System.out.println("Entered number is six.");
        } else if (a == 7) {
            System.out.println("Entered number is seven.");
        } else if (a == 8) {
            System.out.println("Entered number is eight.");
        } else if (a == 9) {
            System.out.println("Entered number is nine.");
        } else {
            System.out.println("Enter single digit number.");
        }
    }
}