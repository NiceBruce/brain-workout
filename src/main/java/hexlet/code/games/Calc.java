package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc implements Game {

    private static final int RANGE = 10;
    private static final char[] MATH_OPERATOR = {'+', '-', '*'};
    private static String generalQuestion = "What is the result of the expression?";


    public final String getGeneralQuestion() {
        return generalQuestion;
    }

    public final String[] getGameData() {

        String[] gameData = new String[GAME_DATA_LEN];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int operand1 = random.nextInt(RANGE);
        int operand2 = random.nextInt(RANGE);

        char mathSymbol = MATH_OPERATOR[random.nextInt(MATH_OPERATOR.length)];
        int expression = 0;

        switch (mathSymbol) {
            case '+':
                expression = operand1 + operand2;
                break;
            case '-':
                expression = operand1 - operand2;
                break;
            case '*':
                expression = operand1 * operand2;
                break;
            default:
                throw new IllegalArgumentException("Unexpected math symbol " + mathSymbol);
        }

        gameData[0] = operand1 + " " + mathSymbol + " " + operand2;
        gameData[1] = Integer.toString(expression);

        return gameData;

    }
}
