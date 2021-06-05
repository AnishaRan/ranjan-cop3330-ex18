package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String input = in.nextLine();
        String inputUC = input.toUpperCase();

        if(inputUC.equals("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int tempF = in.nextInt();
            double result = (tempF - 32.0) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.0f.", result);
        } else {
            System.out.print("Please enter the temperature in Celsius: ");
            int tempC = in.nextInt();
            double result = (tempC * 9.0 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.0f.", result);
        }



    }
}
