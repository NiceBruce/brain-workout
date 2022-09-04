package hexlet.code.games;

public interface Games {

    int NUMBER_OF_GAME_DATA = 3;
    default String[] play() {
        return new String[NUMBER_OF_GAME_DATA];
    };
}
