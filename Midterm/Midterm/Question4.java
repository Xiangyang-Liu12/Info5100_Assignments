import java.util.*;

public class Question4 {

    public static void main(String[] args) {
      String s = "abcabcbb";
        System.out.println(Solution4(s));
    }

    public static String Solution4(String s) {
            String result = "";
            int length = s.length();
            int endPoint = 0;
            int num = 0;

            Set<Character> set = new HashSet<>();
            for(int i = 0; i < length; i++) {
                if(i > 0) {
                    set.remove(s.charAt(i - 1));
                }
                while(endPoint < length) {
                    if(set.add(s.charAt(endPoint))){
                        endPoint++;
                    } else{
                        break;
                    }
                }
                if(endPoint - i > num) {
                    result = s.substring(i,endPoint);
                }
                num = Math.max(num, endPoint - i);
            }
            return result;
        }
    }
