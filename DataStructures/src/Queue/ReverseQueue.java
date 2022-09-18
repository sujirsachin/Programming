package Queue;

import java.util.Stack;
import java.util.Queue;
public class ReverseQueue
{
    public Queue reverse(Queue<Integer> q, int k)
    {
        if(k> q.size())
            throw new IllegalStateException();
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<k;i++)
        {
            s1.add(q.remove());
        }
        int[] array = new int[q.size()];
        int i=0;
        while (!q.isEmpty())
        {
            array[i] = q.remove();
            i++;
        }
        while (!s1.isEmpty())
        {
            q.add(s1.pop());
        }
        for(int j=0;j<array.length;j++)
        {
            q.add(array[j]);
        }
        return q;
    }
}
