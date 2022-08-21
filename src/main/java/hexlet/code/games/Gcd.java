package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcd {

    private static final int RANGE = 100;
    private static final int STARTS_NUMBER = 1;
    private static String gameName = "GCD";
    private static String generalQuestion = "Find the greatest common divisor of given numbers.";

    public static String getGameName() {
        return  gameName;
    }

    public static String getGeneralQuestion() {
        return generalQuestion;
    }

    public static int getDevider(int operand1, int operand2) {

        boolean isFinded = false;
        int result = 0;
        int acc = 0;

        while (!isFinded) {

            if (operand1 % operand2 == 0) {
                result = operand2;
                isFinded = true;
            } else {
                acc = operand1;
                operand1 = operand2;
                operand2 = acc % operand1;
            }
        }
        return result;
    }

    public static void play() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int operand1 = random.nextInt(RANGE);
        int operand2 = random.nextInt(STARTS_NUMBER, RANGE);

        System.out.println("Question: " + operand1 + " " + operand2);
        Engine.setRightAnswer(Integer.toString(getDevider(operand1, operand2)));

        System.out.print("Your answer: ");
        Engine.setUserAnswer(scanner.next());
    }
}
