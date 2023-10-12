package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = getUserInput(scanner,"Enter your first name: ");
        String MiddleName = getUserInput(scanner, "Enter Middle Name: ");
        String LastName = getUserInput(scanner, "Enter last name: ");
        String title = getUserInput(scanner, "Enter your title: ");

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        // String name = "Hally Amor"
        // name.substring(1,5) = "ally "

        // String s = "abcd"
        //s.toUpperCase()   ->  "ABCD"

        //"hally"
        // "h"  -> "H"



        if (MiddleName.length() == 1)
        {
            MiddleName = MiddleName + ".";
        }

        if (!title.isBlank())
        {
            title = ", " + title;
            title = title.toUpperCase();
        }

        System.out.println(firstName + " "+ MiddleName + " " + LastName + title);




    }

    public static  String getUserInput(Scanner scanner, String prompt)
    {
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}