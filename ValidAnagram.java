import java.util.HashMap;

public class ValidAnagram {

    /* Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
    * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
    * 
    * Input: s = "racecar", t = "carrace"
    * Output: true
    * 
    * Input: s = "jar", t = "jam"
    * Output: false
    */

    public static boolean isAnagram_bad(String s, String t) {

        int s_len = s.length();

        // If they have diferent size, cant be valid
        if (s_len != t.length()) {
            return false;

        } else {
            HashMap<String, Integer> mapS = new HashMap<>();
            HashMap<String, Integer> mapT = new HashMap<>();

            // Create a Hasmap <key:Char value:Times>
            for (int i = 0; i < s_len; i++) {
                String cS = String.valueOf(s.charAt(i));
                String cT = String.valueOf(t.charAt(i));

                // Set into map the char as key. Value, if exists, +1. If not, default (0) +1
                mapS.put(cS, mapS.getOrDefault(cS, 0)+1);
                mapT.put(cT, mapT.getOrDefault(cT, 0)+1);
            }

            // If they create the same map, they are valid anagrams
            return (mapS.equals(mapT));
        }
    }


    public static boolean isAnagram_good(String s, String t) {
        // If they have diferent size, cant be valid
        if (s.length() != t.length()) {
            return false;
        }

        // Create a var with alphabet size
        int[] count = new int[26];

        // Iter the word length
        for (int i = 0; i < s.length(); i++) {
            // ASCI a = 97, b = 98, ... So if do 98-97 = 2nd pos of array (B) 
            // We add a unit each time it appears on S string. Subtract if appear on T
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Iter the array. If they are valid, each position must be 0 (add on S, delete on T)
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hole";
        String t = "hols";

        System.out.println(isAnagram_good(s, t));
    }

}
