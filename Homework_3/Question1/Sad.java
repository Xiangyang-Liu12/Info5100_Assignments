public class Sad extends Moody{

    //return string indicating sad
    @Override
    protected String getMood() {
        return "sad";
    }

    //print crying string "'waah' 'boo hoo' 'weep' 'sob'"
    @Override
    public void expressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");

    }
    //returns message about self:"Subject cries a lot"
    public String toString(){
        return "Subject cries a lot";
    }

    @Override
    public void queryMood() {
        super.queryMood();

    }
}
