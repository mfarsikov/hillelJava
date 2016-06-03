package patterns.singleton;

/**
 * Created by MBCNEWMAIN on 03.06.2016.
 */
public final class TheGodSingleton implements God {

    private static class Holder{
        static final TheGodSingleton instance = new TheGodSingleton();
    }

    public static TheGodSingleton getInstance() {
        return Holder.instance;
    }

    private TheGodSingleton() {
        System.out.println("God always been here!");
    }

    @Override
    public final void create() {
        System.out.println("All the world in 7 days");
    }

    @Override
    public void heal() {
        System.out.println("Stand up and go!");
    }

    @Override
    public String getName() {
        return "God";
    }

    public static void prophet() {
        System.out.println("Jesus");
    }

   /* public static void clear() {
        instance = null;
    }*/
}
