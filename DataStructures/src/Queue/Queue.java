package Queue;

import java.util.Arrays;

public class Queue {
    private int[] items= new int[5];
    private int front=0;
    private int rear=0;
    private int count;

    public void enqueue(int item)
    {
        if(count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1) % items.length;
        count++;
    }

    public int dequeue()
    {
        if(!isEmpty())
        {
            int dequeued = items[front];
            items[front] = 0;
            front = (front+1) % items.length;
            count--;
            return dequeued;
        }
        else
            throw new IllegalStateException();
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public boolean isFull()
    {
        return count == items.length;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(items);
    }
}
