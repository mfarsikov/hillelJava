package guessNumber;

/**
 * Created by MBCNEWMAIN on 01.04.2016.
 */
public class Game {
    public static void main(String[] args) {
        ComputerSecretKeeper secretKeeper = new ComputerSecretKeeper(0, 100);
        ComputerSecretBreaker secretBreaker = new ComputerSecretBreaker(0, 100);

        new GameKeeper().startGame(secretKeeper, secretBreaker);

        //new GameKeeper().startGame(new HumanSeecretKeeper(0, 100), new HumanSeecretBreaker(0, 100));
    }

}
