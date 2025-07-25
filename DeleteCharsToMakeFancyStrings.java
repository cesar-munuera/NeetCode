public class DeleteCharsToMakeFancyStrings {

    /* A fancy string is a string where no 3 consecutive characters are equal.
     * Given a string s, delete the minimum possible number of characters from s to make it fancy.
     * Return the final string after the deletion. It can be shown that the answer will always be unique.
     * 
     * Input: s = "leeetcode"
     * Output: "leetcode"
     * 
     * Input: s = "aaabaaaa"
     * Output: "aabaa"
     */

    public static String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        result.append(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                result.append(s.charAt(i));
            }
        }

        if (s.length() == 1) {
            return s;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("aabaaabbccca"));
    }
    
}
