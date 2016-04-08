package exceptions;

/**
 * Created by MBCNEWMAIN on 08.04.2016.
 */
public class MyOwnOutOfIndexException extends RuntimeException{
    public MyOwnOutOfIndexException(String message){
        super(message);
    }
}
