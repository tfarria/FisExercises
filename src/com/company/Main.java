package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Loopy
        //Create ONE string variable to store the output of 5 words that a user will enter at random.

        Scanner keyboard = new Scanner(System.in);

        //Iffy
        //Set a boolean value called redEyes.
        boolean redEyes = false;

        //The value will depend on the value entered by the user for the question "Are your eyes red?"
        System.out.print("Are your eyes red ?  (y/n): ");


        while (redEyes != true){
            keyboard.next();
            keyboard.nextLine();

            String answer = keyboard.nextLine();
            


        }


        //Create an application that will ask,

        //"Are your eyes red?"

        //If the response is 'y', Or 'yes' (regardless of case), then your application should print out:
        //"Get some sleep!"


        //Otherwise your application should print out "You look great!"

        //Use the value of redEyes to determine whether the user should be complimented or not.

                //Iffy Loop
        //Make sure after the application asks the question the first time, you get a prompt asking,
        //"Do you want to try again?"
        //Your application should continue until the user enters 'n' as an answer.


    }
}
