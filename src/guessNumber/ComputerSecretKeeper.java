package guessNumber;

/**
 * Created by MBCNEWMAIN on 01.04.2016.
 */
public class ComputerSecretKeeper implements SecretKeeper{
    private int secretNumber;

    public ComputerSecretKeeper(int from, int to) {
        secretNumber = (int) (Math.random() * (to - from) + from);
        System.out.println("secret is: " + secretNumber);
    }

    public int checkNumber(int probableNumber){
        return Integer.compare(secretNumber, probableNumber);
    }
}
