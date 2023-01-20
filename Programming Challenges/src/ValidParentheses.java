import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    // https://leetcode.com/problems/valid-parentheses
    public static boolean  checkParentheses(String s)
    {
        if(s.length()<2)
        {
            return false;
        }
        HashMap<Character, Character> elements = new HashMap<>();
        elements.put('}','{');
        elements.put(']','[');
        elements.put(')', '(');
        elements.put('>', '<');
        Stack<Character> paranthesesHold = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char current = s.charAt(i);
            if(current == '{' || current == '[' || current == '(' ||
                    current == '<')
            {
                paranthesesHold.add(current);
            }
            else
            {
               if(!paranthesesHold.empty()  && paranthesesHold.peek() == elements.get(current))
                {
                    paranthesesHold.pop();
                }
                else
                    paranthesesHold.add(current);
            }
        }
        return paranthesesHold.empty();
    }

    public static void main(String[] args) {
        System.out.println(checkParentheses("){"));
        System.out.println(checkParentheses("(({}))"));
    }
}
