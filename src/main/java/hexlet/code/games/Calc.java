package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc implements Games {

    private static final int NUMBER_OF_GAME_DATA = 3;
    private String[] gameData = new String[NUMBER_OF_GAME_DATA];
    private static final int RANGE = 10;
    private static final char[] MATH_OPERATOR = {'+', '-', '*'};
    private static String generalQuestion = "What is the result of the expression?";


    public static String getGeneralQuestion() {
        return generalQuestion;
    }

    public final String[] play() {

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
                break;
        }

        gameData[0] = getGeneralQuestion();
        gameData[1] = operand1 + " " + mathSymbol + " " + operand2;
        gameData[2] = Integer.toString(expression);

        return gameData;

    }
}
