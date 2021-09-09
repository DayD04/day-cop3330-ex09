package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "How much in square feet do you need to cover in paint (ex. 350)? " );
        int sqft = input.nextInt();
        int paint;

        paint = sqft / 350;

        if (sqft % 350 != 0) {
            paint = paint + 1;
        }

        System.out.println("You will need " + paint + " gallons of paint to cover " + sqft + " square feet.");

    }
}
