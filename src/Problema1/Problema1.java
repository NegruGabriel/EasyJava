package Problema1;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        //Write a program that asks the user for their name and greets them with their name.
        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome "+name);
    }
}
//Pseodocode
//Ask the user name
//Greet with the user name