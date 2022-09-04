package hexlet.code.games;

import java.util.Random;

public class Progression implements Games {

    private static final int NUMBER_OF_GAME_DATA = 3;
    private String[] gameData = new String[NUMBER_OF_GAME_DATA];
    private static int hiddenElement = 0;
    private static final int MAX_ARR_LENGTH = 10;
    private static final int MIN_ARR_LENGTH = 5;
    private static final int FIRST_EL_GENERATE = 100;
    private static final int MAX_STEP_GENERATE = 20;
    private static final int MIN_STEP_GENERATE = 2;

    private static String generalQuestion = "What number is missing in the progression?";

    public static String getGeneralQuestion() {
        return generalQuestion;
    }

    public static int[] createArray(int length) {

        Random random = new Random();
        int[] resultArr = new int[length];
        int increment = random.nextInt(MIN_STEP_GENERATE, MAX_STEP_GENERATE);
        resultArr[0] =  (random.nextInt(FIRST_EL_GENERATE));

        for (int element = 1; element < resultArr.length; element++) {
            resultArr[element] = resultArr[element - 1] + increment;
        }

        return resultArr;
    }

    public static String getTxtForQuestion(int[] arr) {

        Random random = new Random();
        hiddenElement = random.nextInt(arr.length);
        String txtForQuestion = "";

        for (int element = 0; element < arr.length; element++) {
            if (element == hiddenElement) {
                txtForQuestion += ".. ";
                continue;
            }
            txtForQuestion += arr[element] + " ";
        }

        return txtForQuestion;
    }
    public final String[] play() {

        Random random = new Random();

        int[] numArray = (createArray(random.nextInt(MIN_ARR_LENGTH, MAX_ARR_LENGTH)));

        gameData[0] = getGeneralQuestion();
        gameData[1] = getTxtForQuestion(numArray);
        gameData[2] = Integer.toString(numArray[hiddenElement]);

        return gameData;
    }
}
