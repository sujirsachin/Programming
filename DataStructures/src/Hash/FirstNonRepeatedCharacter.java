package Hash;

import java.util.*;

public class FirstNonRepeatedCharacter
{
    public static Character find(String s)
    {
        if(s.isEmpty())
            return null;
        Queue<Character> q = new ArrayDeque<>();
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                continue;
            if(h.contains(s.charAt(i)))
                q.remove(s.charAt(i));
            else
            {
                h.add(s.charAt(i));
                q.add(s.charAt(i));
            }
        }
        if(!q.isEmpty())
            return q.remove();
        else
            return ' ';
    }

    public static Character find2(String s)
    {
        Map<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
                h.put(s.charAt(i),(h.get(s.charAt(i))+1));
            else
                h.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(h.get(s.charAt(i))<2)
            {
                return s.charAt(i);
            }
        }
        return Character.MIN_VALUE;
    }
    public static void main(String[] args)
    {
        String s = "sssaaccc";
        System.out.println(find2(s));;
    }
}
