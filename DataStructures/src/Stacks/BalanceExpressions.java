package Stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class BalanceExpressions {
    private HashSet<Character> open = new HashSet<>();
    private HashSet<Character> close = new HashSet<>();
    HashMap<Character,Character> pairs = new HashMap<>();
    public BalanceExpressions()
    {
        pairs.put('}','{');
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('>','<');
    }
    public boolean checkBalance(String expression)
    {
        Stack<Character> hold = new Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            if(isOpenBracket(expression.charAt(i)))
                hold.push(expression.charAt(i));
            else if(!isOpenBracket(expression.charAt(i)))
                if(!hold.empty() && pairs.get(expression.charAt(i))==hold.pop())
                    continue;
        }
        return hold.empty();
    }

    private boolean isOpenBracket(char item)
    {
        if(!pairs.containsKey(item) && pairs.containsValue(item))
            return true;
        return false;
    }
    public static void main(String args[])
    {
        BalanceExpressions bal = new BalanceExpressions();
        String expression = "((1 + 2))";
        System.out.println(bal.checkBalance(expression));
    }
}

