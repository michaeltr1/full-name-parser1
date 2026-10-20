package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Full Names first last or first middle lasts
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your full name.");
        String fullName = read.nextLine().trim();

        String[] parts = fullName.split(" ");
        String first;
        String middle;
        String last;
        if (parts.length == 2) {
            first = parts[0];
            middle = "(none)";
            last = parts[1];
        }
        else if (parts.length == 3) {
            first = parts[0];
            middle = parts[1];
            last = parts[2];
        }
        else {
            System.out.println("Invalid format enter first last OR first middle last name.");
            return;
        }
        System.out.println("First name:" + first);
        System.out.println("Middle name:"+ middle);
        System.out.println("Last name:"+ last);

    }

}