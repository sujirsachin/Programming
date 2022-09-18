package Stacks;

import java.util.InputMismatchException;
import java.util.Stack;

public class ReverseAString {
    public static void main(String args[])
    {
        String reverse=null;
        if(reverse==null)
            throw new InputMismatchException();
        Stack<Character> hold = new Stack<>();
        for(int i=0;i<reverse.length();i++)
        {
            hold.push(reverse.charAt(i));
        }
        String reverse2="";
        while (!hold.empty())
        {
            reverse2+=hold.pop();
        }
        System.out.println(reverse2);
    }
}
