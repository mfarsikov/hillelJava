package patterns.singleton;

/**
 * Created by MBCNEWMAIN on 03.06.2016.
 */
public final class TheGod implements God {
    private static TheGod instance;

    public static TheGod getInstance() {
        if (instance == null) {
            synchronized (TheGod.class) {
                if(instance == null) {
                    instance = new TheGod();
                }
            }
        }
        return instance;
    }

    private TheGod() {
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

    public static void clear() {
        instance = null;
    }
}
