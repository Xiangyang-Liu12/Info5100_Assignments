public abstract class Moody {

    //Return the mood: sad or happy - depending on which object sends the message
    protected abstract String getMood();

    //Each object expresses a different mood
    public abstract void expressFeelings();

    //an object responds according to how it feels, print "I feel Happy(or Sad) today!"
    public void queryMood(){
        System.out.println("I feel " + getMood() + " Today.");
    };



}
