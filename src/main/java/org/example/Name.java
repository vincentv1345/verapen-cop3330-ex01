package org.example;
import java.util.Scanner;
/**
 *
 */
public class Name
{
    public static void main( String[] args )
    {
        Scanner name = new Scanner(System.in);
        System.out.print("What is your name? ");
        String newName = name.next();
        System.out.println("Hello " + newName + " nice to meet you!");
    }
}
