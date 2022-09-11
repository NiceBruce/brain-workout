package hexlet.code.games;

import java.util.Random;

public class Gcd implements Game {
    private static final int RANGE = 99;
    private static final int STARTS_NUMBER = 1;
    private static String generalQuestion = "Find the greatest common divisor of given numbers.";

    public final String getGeneralQuestion() {
        return generalQuestion;
    }

    public static int getDivider(int operand1, int operand2) {

        int divider = 0;
        int lowerNumber = (operand1 < operand2) ? operand1 : operand2;

        for (int i = lowerNumber; i > 0; i--) {
            if ((operand1 % i == 0) && (operand2 % i == 0)) {
                divider = i;
                break;
            }
        }

        return divider;
    }

    public final String[] getGameData() {

        String[] gameData = new String[GAME_DATA_LEN];
        Random random = new Random();

        int operand1 = random.nextInt(RANGE);
        int operand2 = random.nextInt(STARTS_NUMBER, RANGE);

        gameData[0] = operand1 + " " + operand2;
        gameData[1] = Integer.toString(getDivider(operand1, operand2));

        return gameData;
    }
}
