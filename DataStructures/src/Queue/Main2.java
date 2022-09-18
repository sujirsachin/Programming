package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args)
    {
        Queue<Integer> q = new ArrayDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        ReverseQueue r = new ReverseQueue();
        System.out.println(q);
        System.out.println(r.reverse(q,4));
    }
}
