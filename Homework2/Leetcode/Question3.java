import java.util.Arrays;

public class Question3 {
    //Move Zeros
    //Time complexity O(n)
    //Space complexity  O(1)
    public static void main(String[] args) {
        //testcases
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};
        System.out.println(Arrays.toString(solution3(nums1)));
        System.out.println(Arrays.toString(solution3(nums2)));

    }
    public static int[] solution3(int[] nums){
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }}
            for(int i = index; i < nums.length; i++){
                nums[i] = 0;
            }
        return nums;
    }
}
