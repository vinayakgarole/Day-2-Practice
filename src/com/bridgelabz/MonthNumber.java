package com.bridgelabz;

import java.util.Scanner;

public class MonthNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month you want to check: ");
        int month = sc.nextInt();

        switch (month) {
            case 1: {
                System.out.println("Your month is January");
                break;
            }
            case 2: {
                System.out.println("Your month is February");
                break;
            }
            case 3: {
                System.out.println("Your month is March");
                break;
            }
            case 4: {
                System.out.println("Your month is April");
                break;
            }
            case 5: {
                System.out.println("Your month is May");
                break;
            }
            case 6: {
                System.out.println("Your month is June");
                break;
            }
            case 7: {
                System.out.println("Your month is July");
                break;
            }
            case 8: {
                System.out.println("Your month is August");
                break;
            }
            case 9: {
                System.out.println("Your month is September");
                break;
            }
            case 10: {
                System.out.println("Your month is October");
                break;
            }
            case 11: {
                System.out.println("Your month is November");
                break;
            }
            case 12: {
                System.out.println("Your month is December");
                break;
            }
            default:
                System.out.println("Please enter valid input");
        }
        System.out.println("Hope you got your answer. Thank you!!");
    }
}