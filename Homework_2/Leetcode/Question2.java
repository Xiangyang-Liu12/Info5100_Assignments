public class Question2 {
    //shortest word distance
    //Time complexity O(n)
    //space complexity O(1)
    public static void main(String[] args) {
        //testcases
      String[]  wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
      String word1 = "coding";
      String word2 = "practice";
      String word3 = "makes";
        System.out.println(solution2(wordsDict,word1,word2));
        System.out.println(solution2(wordsDict,word3,word1));
    }
    public static int solution2(String[] nums, String word1, String word2){
      int index1 = -1;
      int index2 = -1;
      int min = Integer.MAX_VALUE;

      for(int i = 0; i < nums.length; i++){
          if(nums[i].equals(word1)){
              index1 = i;
          }
          if(nums[i].equals(word2)){
              index2 = i;
          }
        //calculate the shortest distance
        if(index1 != -1 && index2 != -1){
            min = Math.min(min, Math.abs(index1 - index2));
        }
      }

        return min;
    }
}
