import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char roman_value = s.charAt(i);
            int v = romanMap.get(roman_value);

            if (i+1 < s.length() && v < romanMap.get(s.charAt(i+1))){
                total -= v;
            } else {
                total += v;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    
}
