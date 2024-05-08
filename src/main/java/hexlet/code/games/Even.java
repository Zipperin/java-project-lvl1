package hexlet.code.games;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.GetRandomNum.getRand;

public class Even {

    public static void startGame() {
        String question = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        final int max = 100;
        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber = getRand(1, max);
            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        runGame(question, questionsAndAnswers);
    }

    /*public Even() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random randomNumber = new Random();

        int count = 0;
        String answer;

        while(count != 3) {
            int currentNumber = randomNumber.nextInt(100) + 1;
            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");
            answer = scanner.next();
            if ((currentNumber % 2 == 0 && Objects.equals(answer, "yes")) || (currentNumber % 2 != 0 && Objects.equals(answer, "no"))) {
                count++;
                System.out.println("Correct!");
            } else {
                if (Objects.equals(answer, "yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                }
                if (Objects.equals(answer, "no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                }

                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");

        }
    }*/
}
