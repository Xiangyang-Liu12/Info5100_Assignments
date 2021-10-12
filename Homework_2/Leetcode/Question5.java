import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {
    //Spiral Matrix
    //Time complexity O(n)
    //Space complexity O(n)
    public static void main(String[] args) {
        //testcases
        int[][] testcase1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] testcase2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(solution5(testcase1));
        System.out.println(solution5(testcase2));

    }

    public static List<Integer> solution5(int[][] nums) {

        List<Integer> result = new ArrayList<>();
        if(nums.length == 0) return result;

        int rowBegin = 0;
        int rowEnd = nums.length - 1;
        int columnBegin = 0;
        int columnEnd = nums[0].length - 1;

        while(rowBegin <= rowEnd && columnBegin <= columnEnd){
            for(int i = columnBegin; i <= columnEnd; i++){
                result.add(nums[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin; i <= rowEnd; i++){
                result.add(nums[i][columnEnd]);
            }
            columnEnd--;

           if(rowBegin <= rowEnd){
            for(int i = columnEnd; i >= columnBegin; i--){
                result.add(nums[rowEnd][i]);
            }
        }
            rowEnd--;
        }
       if(columnBegin <= columnEnd){
        for(int i = rowEnd; i >= rowBegin; i--){
            result.add(nums[rowBegin][i]);
        }
    }
        columnBegin++;
        return result;
    }
}