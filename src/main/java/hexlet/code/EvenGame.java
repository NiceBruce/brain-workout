package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void playEven(String userName) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int winCondition = 3;
        String rightAnswer;


        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        while (count < winCondition) {
            int number = random.nextInt();
            System.out.println("Question: " + number);
            rightAnswer = (number % 2 == 0) ? "yes" : "no";

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                count++;
                if (count == winCondition) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer is was '"
                        + rightAnswer + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
    }
}
