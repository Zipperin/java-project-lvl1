package hexlet.code.games;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.GetRandomNum.getRand;

public class Progression {
    static final int max = 100;
    public static void startGame() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var qwsAndAns : questionsAndAnswers) {

        }
        runGame(question, questionsAndAnswers);
    }
}
