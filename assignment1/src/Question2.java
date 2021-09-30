import java.util.Arrays;

public class Question2 {
    //time complexity O(n)
    //space complexity O(1)
    public static void main(String[] args) {
        //two testcases
    int[] testcase1 = {-4,-1,0,3,10};
    int[] testcase2  ={-7,-3,2,3,11};

        System.out.println(Arrays.toString(solution2(testcase1)));
        System.out.println(Arrays.toString(solution2(testcase2)));
    }


    private static int[] solution2(int[] nums) {
        int[] result = new int[nums.length];

            int index = 0;
            //loop the array and get the square values
            for (int i = 0; i < nums.length; i++) {
                result[index++] = nums[i] * nums[i];
            }
            Arrays.sort(result);


        return result;
    }}
