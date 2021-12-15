import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        int[] nums =  {1,1,1};
        System.out.println(soulution3(nums, 2));
        int[] nums1 = {1,2,3};
        System.out.println(soulution3(nums1,3));
    }
    public static int soulution3(int[] nums, int k) {
        HashMap<Integer, Integer> arr_sum = new HashMap();
        arr_sum.put(0,1);
        int sum = 0;
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(arr_sum.containsKey(sum -k)){
                result += arr_sum.get(sum - k);
            }
            arr_sum.put(sum,arr_sum.getOrDefault(sum, 0)+1);

        }
        return result;
    }
}

