package lesson02.methodchallenge;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Aria", calculateHighScorePosition(1500));
        displayHighScorePosition("Mateo", calculateHighScorePosition(1000));
        displayHighScorePosition("Selene", calculateHighScorePosition(500));
        displayHighScorePosition("Darius", calculateHighScorePosition(100));
        displayHighScorePosition("Liora", calculateHighScorePosition(25));


    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");

    }

    public static int calculateHighScorePosition(int playersScore) {

        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }

        return position;

    }

}
