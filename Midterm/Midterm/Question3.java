import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
       int[] array = {1,3,-1,3,4,-1};
        System.out.println(Solution3(array));
    }

    public static int Solution3(int[] nums){
        int result = 0;

        if(nums.length == 0 || nums == null){
            return -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int num : map.keySet()) {
            if(map.get(num) > 1) {
                result += num;
            }
        }
        return result;
        }

    }

