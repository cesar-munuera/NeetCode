public class Palindrome {

    /* Given an integer x, return true if x is a palindrome, and false otherwise.
     * 
     * Input: x = 121
     * Output: true
     * 
     * Input: x = -121
     * Output: false
     * 
     * Input: x = 10
     * Output: false
     */

    public static boolean isPalindrome (int num){

        String num_str = Integer.toString(num);
        int num_len = num_str.length();
        int iters = num_len/2;

        for(int i=0; i<iters; i++){

            if (num_str.charAt(i) != num_str.charAt(num_len-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        // A palindrome is read the same starting from left or right
        System.out.println(isPalindrome(112));
    }
    
}
