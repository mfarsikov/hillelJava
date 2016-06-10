package java8Features;

import java.util.Optional;

/**
 * Created by MBCNEWMAIN on 10.06.2016.
 */
public class Flat {
    Optional<Citizen> citizen = Optional.empty();

    public Optional<Citizen> getCitizen() {
        return citizen;
    }
}
