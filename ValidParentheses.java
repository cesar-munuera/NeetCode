import java.util.Stack;

public class ValidParentheses {

    /* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     * 
     * Input: s = "()[]{}"
     * Output: true
     * 
     * Input: s = "([])"
     * Output: true
     * 
     * Input: s = "([)]"
     * Output: false
     * 
     * Input: s = "(["
     * Output: false
     */


    public static boolean isValid(String s){
        int items = s.length();

        if(items % 2 == 0){
            // Even

            /* Use a stack to save openings. If find a closing, see if the stacks top matches.
             * If not, its not valid.
             * If find a closing but stack is empty, the string its not valid (example '()}}' )
             * If finish but stack has opening, the string its not valid.
             */

            Stack<Character> myStack = new Stack<>();
            char openChar;

            for (int i = 0; i < items; i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[' || c == '{') {
                    myStack.add(c);

                } else if (myStack.size() > 0){
                    openChar = myStack.pop();

                    if (c == ')' && openChar != '('){
                        return false;
                    } else if (c == ']' && openChar != '['){
                        return false;
                    } else if (c == '}' && openChar != '{'){
                        return false;
                    }

                } else {
                    return false;
                }
            }

            return myStack.size() == 0;

        } else {
            // Odd
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }
}