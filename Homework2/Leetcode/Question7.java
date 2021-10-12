public class Question7 {
// Add Strings
// time complexity O(n)
// space complexity O(n)

    public static void main(String[] args) {
        //testcases
    String s1 =  "11";
    String s2 = "123";
    String s3 = "456";
    String s4 = "77";
        System.out.println(solution7(s1,s2));
        System.out.println(solution7(s3,s4));

    }
    public static String solution7(String s1, String s2){
        StringBuilder add_sum = new StringBuilder();

        //indexes of last elements of two strings
        int t1 = s1.length() - 1;
        int t2 = s2.length() - 1;
        int carry = 0;

        //add two elements
        while(t1 >= 0 || t2 >= 0){
            int sum = carry;
            if(t1 >= 0){
                sum += s1.charAt(t1--) - '0';
            }
            if(t2 >= 0){
                sum += s2.charAt(t2--) - '0';
            }
            add_sum.append(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0){
            add_sum.append(carry);
        }
        return add_sum.reverse().toString();
    }
}
