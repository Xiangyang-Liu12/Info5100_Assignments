public class Happy extends Moody{

    //return string indicating happy
    @Override
    protected String getMood() {
        return "happy";
    }

    //print laughter string "heeehee...hahahah....HAHAHA!!"
    @Override
    public void expressFeelings() {
        System.out.println("heeehee...hahahah....HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood() {
       super.queryMood();

    }
}
