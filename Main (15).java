/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("What is your age? ");
    int age = s.nextInt();
            
    if(age<0)
     System.out.println("Enter a valid age");

    System.out.println( age>=16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
  }
}