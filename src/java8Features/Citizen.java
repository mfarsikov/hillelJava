package java8Features;

import java.util.Optional;

/**
 * Created by MBCNEWMAIN on 10.06.2016.
 */
public class Citizen {
    Optional<Passport> passport = Optional.empty();

    public Optional<Passport> getPassport() {
        return passport;
    }
}
