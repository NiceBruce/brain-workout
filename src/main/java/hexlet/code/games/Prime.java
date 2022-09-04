package hexlet.code.games;

import java.util.Random;

public class Prime implements Games {

    private static final int NUMBER_OF_GAME_DATA = 3;
    private String[] gameData = new String[NUMBER_OF_GAME_DATA];
    private static final int RANGE = 20; // increase difficulty
    private static String generalQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

    public final String[] play() {

        Random random = new Random();

        int number = random.nextInt(RANGE);

        gameData[0] = getGeneralQuestion();
        gameData[1] = Integer.toString(number);
        gameData[2] = isPrime(number);

        return gameData;
    }
}
