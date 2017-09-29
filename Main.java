
package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        recho(args);
        game();

    }

    public static void recho(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            String arg = args[i];
            System.out.print(arg + " ");
        }
    }

    public static void game() {
        //We get the target of the game
        Random rand = new Random();
        int target = rand.nextInt(50);//max number is 50
        boolean win = false;
        while (!win) {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a number: ");
            int guess = reader.nextInt();
            if (guess > target) {
                System.out.println("The target number is lower");
            }
            if (guess < target) {
                System.out.println("The target number is higher");
            }
            if (guess == target) {
                System.out.println("You won!");
                win = true;
            }
        }
        System.out.println("The game is finished!");
    }
}

