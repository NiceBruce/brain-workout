package hexlet.code.games;

public interface Game {

    int GAME_DATA_LEN = 2;
    default String[] getGameData() {
        return new String[GAME_DATA_LEN];
    };

    String getGeneralQuestion();
}
