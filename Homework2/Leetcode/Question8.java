public class Question8 {
    //Valid Palindrome
    //time complexity O(n)
    //space complexity O(1)
    public static void main(String[] args) {
        String testcase1 = "A man, a plan, a canal: Panama";
        String testcase2 = "race a car";
        System.out.println(solution8(testcase1));
        System.out.println(solution8(testcase2));
    }
    public static boolean solution8(String s){
        int start = 0;
        int end = s.length() - 1;

        //check if the elements are digits or characters
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
        }
        if( start < end && Character.toLowerCase(s.charAt(start++))!=Character.toLowerCase(s.charAt(end--))){
            return false;
        }}
        return true;
    }

}
