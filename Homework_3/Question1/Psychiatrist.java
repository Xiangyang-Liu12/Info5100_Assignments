import java.security.PublicKey;

public class Psychiatrist extends Moody{

    //asks moody object about its mood
    public  void examine(Moody moodyObject){
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }
    //a moody object is observed to either laugh or cry
    public void observe(Moody moodyObject){
        moodyObject.expressFeelings();
        System.out.println("Observation: " + moodyObject.toString());

    }
    //returns message about self " Subject laughs a lot "
    public String toString(){
        return "Subject laughs a lot";
    }
    @Override
    protected String getMood() {
        return null;
    }

    @Override
    public void expressFeelings() {

    }
}
