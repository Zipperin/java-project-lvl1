package hexlet.code.games;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.GetRandomNum.getRand;

public class Progression {
    static final int max = 15;
    public static void startGame() {
        String question = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var qwsAndAns : questionsAndAnswers) {
            int progressionLineLength = getRand(5, max);
            int unknownNumber = getRand(1, progressionLineLength);
            int step = getRand(1, 5);
            int firstNum = getRand(0, max);
            int[] mas = new int[progressionLineLength];

            qwsAndAns[0] = "";
            mas[0] = firstNum;
            qwsAndAns[0] += firstNum + " ";

            for (int i = 1; i < progressionLineLength; i++) {
                mas[i] = mas[i - 1] + step;
                if (i != unknownNumber) {
                    qwsAndAns[0] += " " + mas[i] + " ";
                } else {
                    qwsAndAns[0] += " .. ";
                }

            }
            qwsAndAns[0] = qwsAndAns[0].trim();
            qwsAndAns[1] = String.valueOf(mas[unknownNumber]);
        }
        runGame(question, questionsAndAnswers);
    }
}
