/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 07 Solution
 *  Copyright 2021 Theodore Linardic
 */


package oop.ex07;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args)
    {
        double feetToMetersMultiplicationConstant = 0.09290304;

        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String roomLength = userInputScanner.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String roomWidth = userInputScanner.nextLine();
        System.out.println("You entered dimensions of " + roomLength + " feet by " + roomWidth + " feet.\nThe area is:");

        int roomLengthInt = Integer.parseInt(roomLength);
        int roomWidthInt = Integer.parseInt(roomWidth);
        int totalSquareFeet = roomWidthInt * roomLengthInt;

        double totalSquareMeters = totalSquareFeet * feetToMetersMultiplicationConstant;

        System.out.print(totalSquareFeet + " square feet\n" + totalSquareMeters + " square meters");

    }
}
