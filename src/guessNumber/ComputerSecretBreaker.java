package guessNumber;

/**
 * Created by MBCNEWMAIN on 01.04.2016.
 */
public class ComputerSecretBreaker implements SecretBreaker {
    private int from;
    private int to;

    public ComputerSecretBreaker(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int assumeNumber() {
        return (to - from) / 2;
    }

    public int assumeNumber(int secretNumberGreater){
        if(secretNumberGreater > 0){
            from = assumeNumber();
        }else {
            to = assumeNumber();
        }
        return assumeNumber();
    }
}
