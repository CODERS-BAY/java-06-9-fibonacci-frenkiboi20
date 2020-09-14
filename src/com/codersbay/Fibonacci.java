package com.codersbay;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Welche Stelle soll berechnet werden: ");
        long number = sc.nextLong();
        System.out.println("An der " + number + ". Stelle lautet die Fibonacci-Zahl: " + fibonacci(number));
        sc.close();
    }

    private static int fibonacci(long number) {

        if (number == 1 || number == 2) return 1;
        else return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
