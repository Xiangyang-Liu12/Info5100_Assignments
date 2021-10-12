public class Sum {

  // add methods
    public int add(int num1,int num2){
        return num1 + num2;
    }
    public int add(int num1, int num2,int num3){
        return num1 + num2 + num3;
    }

    public double add(int num1,double num4){
        return num1 + num4;
    }
    public double add(double num5,int num3){
        return num5 + num3;
    }
    public double add(double num4, double num5){
        return num4 + num5;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(4,9,12));
        System.out.println(sum.add(4, 5.0));
        System.out.println(sum.add(15.5,5));
        System.out.println(sum.add(1.0,6.4));
    }
}
