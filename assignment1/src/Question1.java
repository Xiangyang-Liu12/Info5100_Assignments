import java.util.HashMap;

public class Question1 {
    //time complexity O(n)
    //space complexity O(n)
    public static void main(String[] args) {
        // testcases
    int[] testcase1 = {1,2,3,2};
    int[] testcase2 = {1,1,1,1,1,1};
    int[] testcase3 = {1,2,3,4,5};
        System.out.println(solution1(testcase1));
        System.out.println(solution1(testcase2));
        System.out.println(solution1(testcase3));

    }

    private static int solution1(int[] nums){
        if(nums.length == 0|| nums == null){
            return 0;
        }
        int result = 0;
        //using HashMap to store values
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.putIfAbsent(i,0);
            map.put(i, map.get(i) + 1);
        }
        //check if there is a unique element exists
        for(int key : map.keySet()){
            if(map.get(key)==1){
                result += key;
            }
        }
        return result;
    }
}
