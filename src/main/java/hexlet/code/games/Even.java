package hexlet.code.games;

import java.util.Random;
public class Even implements Game {
    private static String generalQuestion = "Answer 'yes' if number even otherwise answer 'no'.";
    public final String getGeneralQuestion() {
        return generalQuestion;
    }
    public final String[] getGameData() {

        String[] gameData = new String[GAME_DATA_LEN];
        Random random = new Random();
        int number = random.nextInt();

        gameData[0] = Integer.toString(number);
        gameData[1] = ((number % 2 == 0) ? "yes" : "no");

        return gameData;
    }
}
