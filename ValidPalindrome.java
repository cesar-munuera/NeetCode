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

    public static void main(String[] args) {
        System.out.println(isPalindrome_good("A man, a plan, a canal: Panama"));
    }
    
}
