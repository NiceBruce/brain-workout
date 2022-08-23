package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int MAX_ARR_LENGTH = 10;
    private static final int MIN_ARR_LENGTH = 5;
    private static final int FIRST_EL_GENERATE = 100;
    private static final int MAX_STEP_GENERATE = 20;

    private static final int MIN_STEP_GENERATE = 2;
    private static String gameName = "GCD";
    private static String generalQuestion = "Find the greatest common divisor of given numbers.";

    public static String getGameName() {
        return  gameName;
    }

    public static String getGeneralQuestion() {
        return generalQuestion;
    }

    public static int[] createArray(int length) {

        Random random = new Random();
        int[] resultArr = new int[length];
        int increment = random.nextInt(MIN_STEP_GENERATE, MAX_STEP_GENERATE);

        for (int element = 0; element < resultArr.length; element++) {
            if (element == 0) {
                resultArr[element] = (random.nextInt(FIRST_EL_GENERATE));
                continue;
            }
            resultArr[element] = resultArr[element - 1] + increment;
        }

        return resultArr;
    }

    public static int getHiddenElement(int[] arr) {

        Random random = new Random();
        int hiddenElement = random.nextInt(arr.length);

        System.out.print("Question: ");
        for (int element = 0; element < arr.length; element++) {
            if (element == hiddenElement) {
                System.out.print(".. ");
                continue;
            }
            System.out.print(arr[element] + " ");
        }
        System.out.println();

        return hiddenElement;
    }
    public static void play() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numArray = (createArray(random.nextInt(MIN_ARR_LENGTH, MAX_ARR_LENGTH)));
        int hiddenElement = getHiddenElement(numArray);

        Engine.setRightAnswer(Integer.toString(numArray[hiddenElement]));

        System.out.print("Your answer: ");
        Engine.setUserAnswer(scanner.next());
    }
}
