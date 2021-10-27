package Question2;

public class Printer {
    private static Printer _instance;

    private Printer() {
    }

    private static Object obj = new Object();

    public static Printer getInstance() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }
    public void getConnection(){
        System.out.println("Your Printer is working");
    }
}