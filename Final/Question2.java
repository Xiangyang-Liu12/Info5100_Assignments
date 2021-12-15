import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        String[] strs = {""};
        String[] strs2 = {"a"};
        System.out.println(solution2(strs1));
        System.out.println(solution2(strs));
        System.out.println(solution2(strs2));
    }

    public static  List<List<String>> solution2(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String current : strs){
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        result.addAll(map.values());
        return result;
    }
}

