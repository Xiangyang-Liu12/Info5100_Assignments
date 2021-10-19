public class main {
    public static void main(String[] args) {
        //a psychiatrist object
        Psychiatrist Psychiatrist_1 = new Psychiatrist();
        //moody object 1
        Moody moody_1 = new Happy();
        //moody object 2
        Moody moody_2 = new Sad();
        //the psychiatrist object will examine and observe each moody object
        Psychiatrist_1.examine(moody_1);
        System.out.println();
        Psychiatrist_1.observe(moody_1);
        System.out.println();
        Psychiatrist_1.examine(moody_2);
        System.out.println();
        Psychiatrist_1.observe(moody_2);
    }
}
