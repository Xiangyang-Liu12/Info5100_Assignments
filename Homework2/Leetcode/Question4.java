import java.util.Arrays;

public class Question4 {
    //Rotate Image
    //Time complexity O(n^2)
    //Space complexity O(1)
    public static void main(String[] args) {
        //testcases
        int[][] testcase1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] testcase2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println(Arrays.deepToString(solution4(testcase1)));
        System.out.println(Arrays.deepToString(solution4(testcase2)));
    }
    public static int[][] solution4(int[][] nums){
        int N = nums.length;
        for(int i = 0; i < N; i++){
            for(int j = i; j< N; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < (N/2); j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][N-1-j];
                nums[i][N-1-j] = temp;
            }
        }
        return nums;
    }
}
