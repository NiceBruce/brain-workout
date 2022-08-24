package hexlet.code.games;

public interface Games {
    //this interface was created to avoid "magic number" errors in the SWITCH construction in App.launchApp() method
    static void launchApp() { };
    int EVEN = 2;
    int CALC = 3;
    int GCD = 4;
    int PROGRESSION = 5;
    int PRIME = 6;
}
