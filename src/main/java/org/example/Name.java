package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Vincent Verapen
 */
public class Name
{
    public static void main( String[] args )
    {
        Scanner name = new Scanner(System.in);
        Greeter greeter = new Greeter();
        System.out.print("What is your name? ");
        String newName = name.nextLine();
        String greet = greeter.greet(newName);
    }
}
