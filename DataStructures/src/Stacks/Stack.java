package Stacks;

import Arrays.Array;

import java.util.Arrays;

public class Stack {
    private int stack[] = new int[5];
    private int count=0;
    public void push(int item)
    {
        if(count == stack.length)
            throw new StackOverflowError();
        stack[count++] = item;
    }
    public int pop()
    {
        int pop;
        if(count>0)
        {
            count--;
            return stack[count];
        }
        else
        {
            throw new IllegalStateException();
        }
    }

    public int peek()
    {
        if(count <= 0)
        {
            throw new IllegalStateException();
        }
        else
        {
            return stack[count - 1];
        }
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    @Override
    public String toString()
    {
        int[] array = new int[count];
        for(int i=0;i<count;i++)
        {
            array[i] = stack[i];
        }
        return Arrays.toString(array);
    }
}
