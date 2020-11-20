package com.damianosiak.View;

import com.damianosiak.Model.Number;
import com.damianosiak.Controller.Calculations;

/**
 * This class is responsible for various methods - for example menus, errors
 */
public class Menu {
    /**
     * This method is responsible for displaying menu with ten options
     */
    public void displayMenu(){
        System.out.println("Select:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. History");
        System.out.println("5. Join RED team");
        System.out.println("6. Join GREEN team");
        System.out.println("7. Join BLUE team");
        System.out.println("8. View your team motto");
        System.out.println("9. Number A to power of Number B");
        System.out.println("0. Exit");
    }

    /**
     * This method is responsible for displaying error if user not insert in good form start parameters, for example if user forgot to enter two numbers or enter invalid parameter - char, string
     */
    public void displayNoArgsError(){
        System.out.println("Without enter two NUMBERS this will don't work!");
        //System.out.println("Please correct your running statements using correct form, ex. java -jar <YourProgramName>.jar <valueA> <valueB>");
        System.out.println("Write: ' java -jar <YourProgramName>.jar -h ' to get help");
    }

    /**
     * This method is responsible for displaying error if user in menu choose wrong option
     */
    public void displayWrongCaseError(){
        System.out.println("You are selected wrong case, please try again.");
    }

    /**
     * This method is responsible for displaying help information
     */
    public void displayHelp(){
        System.out.println("To run this application you must type two parameters: first number and second number.");
        System.out.println("java -jar <YourProgramName>.jar <valueA> <valueB>");
        System.out.println("For example: if you would like to operate on numbers 1 and 2, you must type: java -jar <YourProgramName>.jar 1 2");
    }
}
