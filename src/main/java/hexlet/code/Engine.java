package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;

public class Engine {

    private static String rightAnswer;
    private static String userAnswer;
    private static int countToWin = 0;
    private static final int WIN_CONDITION = 3;


    public static String getRightAnswer() {
        return rightAnswer;
    }

    public static String getUserAnswer() {
        return userAnswer;
    }

    public static String setRightAnswer(String expression) {
        rightAnswer = expression;
        return rightAnswer;
    }

    public static String setUserAnswer(String expression) {
        userAnswer = expression;
        return userAnswer;
    }

    public static void askGeneralQuestion(String generalQuestion) {
        if (countToWin < 1) {
            System.out.println(generalQuestion);
        }
    }

    public static String getSorryMessage(String userInput, String answer) {

        String sorryMessage =  "'" + userInput + "' is wrong answer ;(. Correct answer is was '"
                + answer + "'. \nLet's try again, ";

        return sorryMessage;
    }

    public static void gameSelector(String gameName) {

        switch (gameName) {
            case "Even":
                askGeneralQuestion(Even.getGeneralQuestion());
                Even.play();
                break;
            case "Calc":
                askGeneralQuestion(Calc.getGeneralQuestion());
                Calc.play();
                break;
            default:
                break;
        }
    }
    public static void gamePlay(String userName, String gameName) {

        System.out.println("Welcome to the Brain Games!");

        while (countToWin <= WIN_CONDITION) {

            gameSelector(gameName);

            if (userAnswer.equals(rightAnswer)) {

                System.out.println("Correct!");
                countToWin++;
                if (countToWin == WIN_CONDITION) {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            } else {
                System.out.println(getSorryMessage(userAnswer, rightAnswer) + userName + "!");
                break;
            }
        }
    }
}
