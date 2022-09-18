package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueuesTest
{
    public static void main(String arg[])
    {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(5);
        q.add(6);
        q.add(7);
        reverse(q);
        System.out.println(q);
    }
    private static void reverse(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty())
            s.push(q.remove());
        while (!s.isEmpty())
            q.add(s.pop());
    }
}
