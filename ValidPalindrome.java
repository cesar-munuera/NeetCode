public class ValidPalindrome {

    /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
     * and removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * 
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * 
     * Input: s = "race a car"
     * Output: false
     */

    public static boolean isPalindrome_bad(String s) {

        // This method is slower because of this line
        String clean_string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int string_size = clean_string.length();
        int iters = string_size/2;
        
        for(int i=0; i<iters; i++){
            if(clean_string.charAt(i) != clean_string.charAt(string_size-1-i)){
                return false;
            }
        }
        
        return true;
    }


    public static boolean isPalindrome_good(String s) {
        StringBuilder newStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }


    public static boolean isPalindrome_best(String s) {

        /* Here we take 2 pointers, starting from left and right. Search for the first num or letter (from both sides).
         * If cand find, move the pointer to the next, until find a letter or num.
         * Left pointer must be lower than right one, always. If they are not the same, not palindrome.
         */

        int left_i = 0, right_i = s.length()-1;

        while(left_i < right_i){

            while(left_i < right_i && !isAlphaNum(s.charAt(left_i))){
                left_i++;
            }

            while(left_i < right_i && !isAlphaNum(s.charAt(right_i))){
                right_i--;
            }

            if(Character.toLowerCase(s.charAt(left_i)) != Character.toLowerCase(s.charAt(right_i))){
                return false;
            }

            left_i++;
            right_i--;
        }

        return true;
    }

    public static boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z' ||
                c >= 'A' && c <= 'Z' ||
                c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome_best("A man, a plan, a canal: Panama"));
    }
    
}
