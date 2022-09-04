package hexlet.code.games;

import java.util.Random;
public class Even implements Games {
    private static final int NUMBER_OF_GAME_DATA = 3;
    private String[] gameData = new String[NUMBER_OF_GAME_DATA];
    private static String generalQuestion = "Answer 'yes' if number even otherwise answer 'no'.";
    public static String getGeneralQuestion() {
        return generalQuestion;
    }
    public final String[] play() {

        Random random = new Random();
        int number = random.nextInt();

        gameData[0] = getGeneralQuestion();
        gameData[1] = Integer.toString(number);
        gameData[2] = ((number % 2 == 0) ? "yes" : "no");

        return gameData;
    }
}
