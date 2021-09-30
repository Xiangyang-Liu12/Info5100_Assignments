import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question4 {
    //time complexity O(n)
    //space complexity O(n)
    public static void main(String[] args) {
        // two testcases
       boolean testcase1 = solution4("a","b");
       boolean testcase2 = solution4("aa", "aab");
        System.out.println(testcase1);
        System.out.println(testcase2);
    }

    public static boolean solution4(String s, String t){
        //using hashmap to store string values
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),1);
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }
        }
        //check if values exists in the map
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
               return false;
            }else if(map.get(s.charAt(i)) == 0){
                return false;
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
            }
            }
        return true;
        }
}
