package com.damianosiak;

import com.damianosiak.View.Menu;
import com.damianosiak.Controller.Calculations;
import com.damianosiak.Model.Number;
import java.util.Scanner;

/**
 * Simple and atypical calculator that offers four calculations: addition, subtraction, multiplication and exponentiation; and history and possibility to join a team
 *
 * @author Damian Osiak, Student ID: 40843, WSB University Cieszyn, 3 semester of Computer Science - extramural
 * @version 0.1
 */

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(); /** This action is creating new menu object */
        Scanner scanner = new Scanner(System.in);
        Long numberA=null; /** This action is creating new "numberA" variable in "Long" variable system and setting variable value to "null" */
        Long numberB=null; /** This action is creating new "numberB" variable in "Long" variable system and setting variable value to "null" */

        /**
         * This if statement check if application have two entered parameters
         * If have the application is still performed, if else the application is closed with error specific message
         */
        if((args.length==2)){
            boolean isAOkay=true;
            /**
             * This exception statement check if application have correctly entered first parameter - number in "Long" variable system
             */
            try{
                numberA=Long.parseLong(args[0]);
            }catch(NumberFormatException e){
                isAOkay=false;
            }

            /**
             * This if statement check if application have correctly entered first parameter - number in "Long" variable system
             * If have correctly entered then is still performed, if else then is stopped with error specific message
             */
            if(isAOkay){
                boolean isBOkay=true;
                /**
                 * This exception statement check if application have correctly entered second parameter - number in "Long" variable system
                 */
                try{
                    numberB=Long.parseLong(args[1]);
                }catch(NumberFormatException e){
                    isBOkay=false;
                }

                /**
                 * This if statement check if application have correctly entered second parameter - number in "Long" variable system
                 * If have correctly entered then is still performed, if else then is stopped with error specific message
                 */
                if(isBOkay){
                    Calculations calculations = new Calculations(); /** This action is creating new calculation object */
                    Boolean programIsRunning = true; /** This boolean containing actual program status - running or stopped */
                    Number number = new Number(); /** This action is creating new number model object */

                    /**
                     * This while loop is executed while program is still running
                     */
                    while(programIsRunning){
                        menu.displayMenu(); /** This action is executing method for displaying menu from before created menu object */
                        System.out.print("Select: ");
                        int menuValue = scanner.nextInt(); /** This action is getting user entered number for menu options */

                        /**
                         * This switch statement is control all program functions. Switch is using before entered number
                         */
                        switch (menuValue) {
                            /** This case is responsible for executing and displaying addition calculation */
                            case 1:
                                System.out.println("Addition result of " + numberA + " and " + numberB + " is " + calculations.addition(numberA, numberB));
                                break;
                            /** This case is responsible for executing and displaying subtraction calculation */
                            case 2:
                                System.out.println("Subtraction result of " + numberA + " and " + numberB + " is " + calculations.subtraction(numberA, numberB));
                                break;
                            /** This case is responsible for executing and displaying multiplication calculation */
                            case 3:
                                System.out.println("Multiplication result of " + numberA + " and " + numberB + " is " + calculations.multiplication(numberA, numberB));
                                break;
                            /** This case is responsible for getting calculations history */
                            case 4:
                                calculations.getHistory();
                                break;
                            /** This case is responsible for entering to RED team */
                            case 5:
                                number.setTeam(Number.Team.RED);
                                System.out.println("You are joined to RED team");
                                programIsRunning=true;
                                break;
                            /** This case is responsible for entering to GREEN team */
                            case 6:
                                number.setTeam(Number.Team.GREEN);
                                System.out.println("You are joined to GREEN team");
                                programIsRunning=true;
                                break;
                            /** This case is responsible for entering to BLUE team */
                            case 7:
                                number.setTeam(Number.Team.BLUE);
                                System.out.println("You are joined to BLUE team");
                                programIsRunning=true;
                                break;
                            /** This case is responsible for displaying team motto */
                            case 8:
                                try{
                                    System.out.println("Your team motto is: "+number.getTeam());
                                }catch(NullPointerException e){
                                    System.out.println("You are not in any team");
                                }
                                programIsRunning=true;
                                break;
                            /** This case is responsible for executing and displaying exponentiation calculation */
                            case 9:
                                System.out.println("Exponentiation result of " + numberA + " divided by " + numberB + " is " + calculations.exponentiation(numberA,numberB));
                                //programIsRunning=true;
                                break;
                            /** This case is responsible for stopping application */
                            case 0:
                                programIsRunning=false;
                                break;
                            default:
                                menu.displayWrongCaseError();
                                break;
                        }
                    }
                }else{
                    /**
                     * This action is displaying specific error message if second entered parameter is not valid
                     */
                    menu.displayNoArgsError();
                }
            }else{
                /**
                 * This action is displaying specific error message if second entered parameter is not valid
                 */
                menu.displayNoArgsError();
            }
        }else if(args.length==1){
            /**
             * This if statement check if one entered input parameter is "-h" and if return true, then return help information message
             */
            if(args[0].equals("-h")){
                menu.displayHelp();
            }else{
                /**
                 * This action is displaying specific error message if second one entered parameter is not "-h"
                 */
                menu.displayNoArgsError();
            }
        }
        /**
         * This if statement is checking if application have no entered parameters.
         * If return true then help information message is displaying
         */
        else if(args.length==0){
            menu.displayHelp();
        }else{
            /**
             * This action is displaying specific error message if application have bad entered input parameters
             */
            menu.displayNoArgsError();
        }
    }
}
