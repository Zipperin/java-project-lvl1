package hexlet.code.games;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Utils.getRand;

public class Calc {
    static final int max = 100;
    static final int numOperators = 3;
    public void startGame() {
        String question = "What is the result of the expression?\nQuestion: ";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var qwsAndAns : questionsAndAnswers) {
            int firstNumExpression = getRand(1, max);
            int stepNumExpression = getRand(1, max);
            int currentNumOperator = getRand(1, numOperators);

            switch (currentNumOperator) {
                // если 1, будет умножение
                case 1-> {
                    qwsAndAns[0] = firstNumExpression + " * " + stepNumExpression;
                    qwsAndAns[1] = String.valueOf(firstNumExpression * stepNumExpression);
                }
                // если 2, будет сложение
                case 2-> {
                    qwsAndAns[0] = firstNumExpression + " + " + stepNumExpression;
                    qwsAndAns[1] = String.valueOf(firstNumExpression + stepNumExpression);
                }
                // если 3 будет вычитание
                case 3-> {
                    qwsAndAns[0] = firstNumExpression + " - " + stepNumExpression;
                    qwsAndAns[1] = String.valueOf(firstNumExpression - stepNumExpression);
                }
            }
        }
        runGame(question, questionsAndAnswers);
    }
}
