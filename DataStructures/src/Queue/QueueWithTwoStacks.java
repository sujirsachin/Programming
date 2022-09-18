package Queue;


import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int item)
    {
        s1.add(item);
    }
    public int dequeue()
    {
        if(isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return s2.pop();
    }

    public int peek()
    {
        if(isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return s2.peek();
    }

    private void moveStack1ToStack2() {
        if(s2.isEmpty())
        {
            while (!s1.empty())
                s2.push(s1.pop());
        }
    }


    public boolean isEmpty()
    {
        return s1.isEmpty() && s2.isEmpty();
    }
}
