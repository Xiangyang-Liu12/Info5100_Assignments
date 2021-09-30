public class Question5 {
    //Time complexity O(n)
    //space complexity O(1)
    public static void main(String[] args) {
        //two testcases
        System.out.println(solution5("1A3d4s5t "));
        System.out.println(solution5("A2bb2d4"));
    }
    public static boolean solution5(String str){
        if(str.length() == 1 || str == null){
            return false;
        }
        //using .isDigit() method to check
        for(int i = 0; i < str.length()-2;i++){
            //check if the string have no digit followed by another digit.
                if(Character.isDigit(str.charAt(i))&& Character.isDigit(str.charAt(i+1))){
                    return false;
                    //check if the string have no letter followed by another letter
                }else if(!Character.isDigit(str.charAt(i))&& !Character.isDigit(str.charAt(i+1))){
                    return false;
                }
            }
        return true;
        }

    }

