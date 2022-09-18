package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Array {
    private int[] items;
    private int size = 0;
    public Array(int length)
    {
        items = new int[length];
    }

    public void insert(int element)
    {
        if(size < items.length)
        {
            items[size]= element;
            size++;
        }
        else
        {
            int[] newArray = new int[size+1];
            for(int i=0;i<size;i++)
            {
                newArray[i] = items[i];
            }
            items = newArray;
            items[size++]= element;
            return;
        }
    }

    public void insertAt(int element, int position)
    {
        if(size < items.length)
        {
            int a;
            int b;
            b = items[position];
            items[position] = element;
            for (int i=position+1;i<items.length;i++)
            {
                a = items[i];
                items[i] = b;
                b = a;
            }
        }
    }

    public void removeAt(int index)
    {
        if(index<0 || index >= size)
            throw new IllegalArgumentException();
        for(int i=index;i<size-1;i++)
        {
            items[i] = items[i+1];
        }
        size--;
    }

    public int indexOf(int element)
    {
        for(int i=0;i<size;i++)
        {
            if(items[i]==element)
            {
                return i;
            }
        }
        return -1;
    }

    public int max()
    {
        int max=items[0];
        for(int i=1;i<size;i++)
        {
            if(items[i]>max)
            {
                max = items[i];
            }
        }
        return max;
    }

    public ArrayList<Integer> intersect(int[] array)
    {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> temp = new HashSet<>();
        int index=0;
        for(int i=0;i<array.length;i++)
        {
            temp.add(array[i]);
        }
        for(int i=0;i<size;i++)
        {
            if(temp.contains(items[i]))
            {
                result.add(items[i]);
            }
        }
        return result;
    }

    public void printElements()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(items[i]+" ");
        }
    }


}
