import java.util.HashMap;
import java.util.Map;

public class Question6 {
    //Isomorphic String
    //time complexity O(n)
    //space complexity O(n)
    public static void main(String[] args) {
        //testcases
    String s1 = "egg";
    String t1 = "add";
        System.out.println(solution6(s1,t1));
        String s2 = "foo";
        String t2 = "bar";
        System.out.println(solution6(s2,t2));
    }
    public static String transformString(String s){
        //using hashmap to store values
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); ++i){
            char c1 = s.charAt(i);
            if(!map.containsKey(c1)) {
                map.put(c1, i);
            }
                result.append(Integer.toString(map.get(c1)));
                result.append(" ");
            }
        return result.toString();
        }


    public  static boolean solution6(String s, String t){
        return transformString(s).equals(transformString(t));
    }
}
