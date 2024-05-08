package hexlet.code.games;

import java.util.ArrayList;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.GetRandomNum.getRand;

public class Prime {
    public static void startGame() {
        String question = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        final int max = 100;


        for (var qwsAndAns : questionsAndAnswers) {
            ArrayList<Integer> simpleNumList = new ArrayList<>();
            int randomNumber = getRand(1, max);
            for (int i = 0; i <= randomNumber; i++) {
                if (isSimple(i)) {
                    simpleNumList.add(i);
                }
            }
            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = simpleNumList.contains(randomNumber) ? "yes" : "no";
        }
        runGame(question, questionsAndAnswers);
    }

    private static boolean isSimple(int num) {
        if (num < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;
    }
}
