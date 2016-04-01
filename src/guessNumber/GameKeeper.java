package guessNumber;

/**
 * Created by MBCNEWMAIN on 01.04.2016.
 */
public class GameKeeper {
    public void startGame(SecretKeeper secretKeeper, SecretBreaker secretBreaker){
        int assumedNumber = secretBreaker.assumeNumber();
        int result = secretKeeper.checkNumber(assumedNumber);

        while(result != 0){
            System.out.println(assumedNumber);
            assumedNumber = secretBreaker.assumeNumber(result);
            result = secretKeeper.checkNumber(assumedNumber);
        }

        System.out.println("secret number was: " + assumedNumber);
    }
}
