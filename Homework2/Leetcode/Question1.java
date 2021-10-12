import java.util.Arrays;

public class Question1 {
    //Transpose Matrix
    //Time complexity O(n^2)
    //space complexity O(n)
    public static void main(String[] args) {
        //two testcases
        int[][] testcase1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] testcase2 ={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(solution1(testcase1)));
        System.out.println(Arrays.deepToString(solution1(testcase2)));
    }

    public static int[][] solution1(int[][] nums){
        if(nums == null){
            return null;
        }
        int row = nums.length;
        int column = nums[0].length;

        int[][] result = new int[column][row];
        //flip values of the matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                result[j][i] = nums[i][j];
            }
        }
        return result;
    }
}
