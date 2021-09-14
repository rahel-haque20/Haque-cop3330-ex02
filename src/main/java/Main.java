/*
* UCF COP 3330 Fall 2021 Assignment 2 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("What is the input string? ");
        Scanner input_string = new Scanner(System.in);
        String str = input_string.nextLine();
        System.out.printf("%s has %d characters", str, str.length());
    }
}
