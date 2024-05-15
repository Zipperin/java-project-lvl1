package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        String gameNumber = scanner.next();
        getChoice(gameNumber);
        scanner.close();
    }


    public static void getChoice(String gameNumber) {

        Cli cli = new Cli();
        Even even = new Even();
        Calc calc = new Calc();
        GCD gcd = new GCD();
        Progression progression = new Progression();
        Prime prime = new Prime();

        switch (gameNumber) {
            case "1" -> cli.welcome();
            case "2" -> even.startGame();
            case "3" -> calc.startGame();
            case "4" -> gcd.startGame();
            case "5" -> progression.startGame();
            case "6" -> prime.startGame();
            default -> {
            }
        }
    }
}