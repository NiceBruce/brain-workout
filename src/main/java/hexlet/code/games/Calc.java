package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
public class Calc {
    private static final int RANGE = 10;
    private static String gameName = "Calc";
    private static String generalQuestion = "What is the result of the expression?";

    public static String getGameName() {
        return gameName;
    }

    public static String getGeneralQuestion() {
        return generalQuestion;
    }

    public static void play() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int operand1 = random.nextInt(RANGE);
        int operand2 = random.nextInt(RANGE);

        char[] mathOperator = {'+', '-', '*'};
        char mathSymbol = mathOperator[random.nextInt(mathOperator.length)];

        var expression = (mathSymbol == '+') ? operand1 + operand2
                : (mathSymbol == '-') ? operand1 - operand2
                : operand1 * operand2;

        System.out.println("Question: " + operand1 + " " + mathSymbol + " " + operand2);
        Engine.setRightAnswer(Integer.toString(expression));
        //Engine.rightAnswer = Integer.toString(expression);

        System.out.print("Your answer: ");
        Engine.setUserAnswer(scanner.next());
        //Engine.userAnswer = scanner.next();
    }
}
