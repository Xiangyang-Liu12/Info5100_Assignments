public class Question9 {
    //reverse word
    //time complexity O(n)
    //space complexity O(n)
    public static void main(String[] args) {
        //testcases
        String testcase1 = "the sky is blue";
        String testcase2 ="Hello world";
        System.out.println(solution9(testcase1));
        System.out.println(solution9(testcase2));
    }
    public static String solution9(String words){
        if(words == null || words.length()==0){
            return words;
        }
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder();
        words = reverseString(words);
        while(right < words.length()){
            if(words.charAt(left) == ' '){
                left++;
                right++;
            }else if(words.charAt(right) != ' '){
                right++;
            }else{
                sb.append(reverseString(words.substring(left,right)) + " ");
                left = right;
            }
        }
        if(left < right && words.charAt(left)!=' '){
            sb.append(reverseString(words.substring(left,right)) + " ");
        }
        return sb.length() > 1 ? sb.toString().substring(0,sb.length() -1) : " ";
    }
    public static String reverseString(String s){
        char charArr[] = s.toCharArray();
        int right = s.length() - 1;
        int left = 0;
        while(left < right){
        char temp = charArr[right];
        charArr[right] = charArr[left];
        charArr[left] = temp;
        left++;
        right--;
    }
    return new String(charArr);
}}
