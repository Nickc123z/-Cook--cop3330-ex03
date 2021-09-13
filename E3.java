/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;



public class E3 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("What is the quote?");
        String string = input.nextLine();

        Scanner input1 = new Scanner (System.in);
        System.out.println("who said it?");
        String string1 = input1.nextLine();


        System.out.println(string1 + " says, \""+string+"");


    }
}