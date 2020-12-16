package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void rollDice(){         //Will be called if user says yes

        int sides = 7; //Random classes will see this as 0-6
        Random roll = new Random();
        int ran = roll.nextInt(sides);
            if(ran == 0){ // A dice cant have a zero side
                ran = roll.nextInt(sides - 1)+ 1; //Make sure that if it equals zero just add 1, theoretically it should equal 1 if we were to roll the dice

            }

            int [] myRandoms = new int[ran]; //Bring all those randoms into an array


        System.out.println(ran);

    }


    private static void user(){

        System.out.println("Do you want to roll the dice? Type Yes exactly or No exactly");
        Scanner userInput = new Scanner(System.in);
        if(userInput.hasNext("Yes")){

            Scanner intInput = new Scanner(System.in);

            System.out.println("How many times? Type any real integer (1. 20, 9, 96, etc)");
            int x = intInput.nextInt();

                for(int i = 0; i <= x; i++) {
                    rollDice();
                }


        } else if (userInput.hasNext("No")) {

            System.out.println("Guess not lol");
        } else {
            System.out.println("Invalid Input");
        }

    }



    public static void main(String[] args) {
	// write your code here

        user();



    }
}


