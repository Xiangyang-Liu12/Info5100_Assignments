public class Question10 {
    //String compression
    //time complexity O(n)
    //space complexity O(1)
    public static void main(String[] args) {
        //testcases
        char[] testcase1 = {'a','a','b','b','c','c','c'};
        char[] testcase2 ={ 'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(solution10(testcase1));
        System.out.println(solution10(testcase2));
    }

    public static int solution10(char[] chars){
        int index = 0;
        int i = 0;
        while(i < chars.length){
            int j = i;
            while(j < chars.length && chars[i] == chars[j]){
                j++;
            }
            chars[index++] = chars[i];
            //count the numbers
            if(j - i >1){
                String count = j - i + "";
                for(char c : count.toCharArray()){
                    chars[index++] = c;
                }

            }
            i=j;
        }
        return index;
    }
}
