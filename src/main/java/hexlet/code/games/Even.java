package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {

    private static String gameName = "Even";
    private static String generalQuestion = "Answer 'yes' if number even otherwise answer 'no'.";

    public static String getGameName() {
        return gameName;
    }

    public static String getGeneralQuestion() {
        return generalQuestion;
    }
    public static void play() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt();

        System.out.println("Question: " + number);
        Engine.setRightAnswer((number % 2 == 0) ? "yes" : "no");

        System.out.print("Your answer: ");
        Engine.setUserAnswer(scanner.next());

    }
}
