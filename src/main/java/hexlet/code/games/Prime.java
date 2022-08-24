package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static final int RANGE = 20; // increase difficulty
    private static String gameName = "Prime";
    private static String generalQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String getGameName() {
        return  gameName;
    }

    public static String getGeneralQuestion() {
        return generalQuestion;
    }

    public static String isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return (number < 2) ? "no" : "yes";
    }

    public static void play() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(RANGE);

        System.out.println("Question: " + number);
        Engine.setRightAnswer(isPrime(number));

        System.out.print("Your answer: ");
        Engine.setUserAnswer(scanner.next());
    }
}
