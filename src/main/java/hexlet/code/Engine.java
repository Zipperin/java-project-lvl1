package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int NUMBEROFQUESTIONS = 3;
    public static void runGame(String question, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (var qwsAndAns : questionsAndAnswers) {
            System.out.println("Question: " + qwsAndAns[0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals(qwsAndAns[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(."
                        + " Correct answer was '" + qwsAndAns[1] + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}