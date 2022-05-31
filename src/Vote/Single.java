package Vote;

public class Single {
    private static Single instance;

    public String getA() {
        return a;
    }

    private final String a;
    private Single (String a) {
        this.a = a;
    };

    public static synchronized Single getInstance(String a) {
        if (instance == null) {
            instance = new Single(a);
        }
        return instance;
    }

}
