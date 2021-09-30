import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question3 {
    //time complexity O(n)
    //space complexity 0(1)
    public static void main(String[] args) {
        int[] testcase1 = {2, 3, 4, 2, 2, 3, 5, 7};
        System.out.println(solution(testcase1));

    }
     //the first solution to solve this problem is to use hashSet
    private static int solution3(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        //using hashset to store values and delete existing values
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains((i))){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        //find the first non-repeated integer in an array
        for(int i : set){
            return arr[i];
        }
       return -1;
    }
    //the second solution to solve this problem is to use hashMap
    private static int solution(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
       // for(int key : map.keySet()){
        //    if(map.get(key) == 1){
          //      return key;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1){
                return key;
            }
        }
        return -1;
    }
}