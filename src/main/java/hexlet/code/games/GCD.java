package hexlet.code.games;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.GetRandomNum.getRand;

public class GCD {
    static final int max = 100;
    public static void startGame() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var qwsAndAns : questionsAndAnswers) {
            int firstNumGCD = getRand(1, max);
            int stepNumGCD = getRand(1, max);

            qwsAndAns[0] = firstNumGCD + " " + stepNumGCD;
            qwsAndAns[1] = String.valueOf(gcd(firstNumGCD, stepNumGCD));

        }
        runGame(question, questionsAndAnswers);
    }

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
