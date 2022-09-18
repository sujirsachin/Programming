package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int value)
    {
        var node = new Node(value);
        if(isEmpty())
            first = last = node;
        else
        {
            last.next = node;
            last = node;
        }
        size++;
    }
    public void addFirst(int item)
    {
        var node = new Node(item);
        if(isEmpty())
        {
            first = last = node;
        }
        else
        {
            node.next = first;
            first =node;
        }
        size++;
    }

    public void removeFirst()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        if(first.next==null)
        {
            first=null;
            size--;
            return;

        }
        else
        {
            Node currentNode = first.next;
            first.next = null;
            first = currentNode;
        }
        size--;
        return;
    }

    public void removeLast()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        if(first==last)
        {
            first=last=null;
            size--;
        }
        else
        {
            Node newLast = getPrevious(last);
            last = newLast;
            newLast.next = null;
            size--;
            return;
        }
    }

    public void reverseList()
    {
        int hold[] = toArray();
        for(int i=0;i<hold.length;i++)
        {
            removeLast();
        }
        for(int i=hold.length-1;i>=0;i--)
        {
            addLast(hold[i]);
        }
    }

    public Integer kthNode(int k)
    {
        int index = size - k;
        return valueOf(index);
    }

    public int[] middle()
    {
        if(size % 2 == 0)
        {
            int result[] = new int[2];
            int number = (size-1)/2;
            result[0] = valueOf(number);
            result[1] = valueOf(number+1);
            return result;
        }
        else
        {
            int result[] = new int[1];
            result[0] = valueOf((size-1)/2);
            return result;
        }
    }

    public Node getPrevious(Node node)
    {
        Node currentNode = first;
        while(currentNode != null)
        {
            if(currentNode.next == node)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public int sizeOf()
    {
        return size;
    }

    public int indexOf(int value)
    {
        if(isEmpty())
        {
            return -1;
        }
        if(first.value==value)
        {
            return 0;
        }
        Node currentNode = first.next;
        int count=0;
        while(currentNode != null)
        {
            if(currentNode.value == value)
            {
                return count;
            }
            currentNode = currentNode.next;
            count++;
        }
        return -1;
    }

    public Integer valueOf(int index)
    {
        Node currentNode = first;
        int count=0;
        while(currentNode != null)
        {
            if(count == index)
            {
                return currentNode.value;
            }
            currentNode = currentNode.next;
            count++;
        }
        return null;
    }

    public boolean contains(int value)
    {
        if(indexOf(value)<0)
        {
            return false;
        }
        return true;
    }
    private boolean isEmpty()
    {
        if(first==null)
            return true;
        else
            return false;
    }

    public void printList()
    {
        if(isEmpty())
            return;
        if(first==last)
        {
            System.out.print("[ "+first.value+" ]");
            return;
        }
        Node currentNode= first;
        System.out.print("[ ");
        while(currentNode!=null)
        {
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }
        System.out.print("]");
    }

    public int[] toArray()
    {
        if(isEmpty())
            return null;
        int result[] = new int[size];
        Node currentNode = first;
        int i=0;
        while(currentNode != null)
        {
            result[i]= currentNode.value;
            i++;
            currentNode = currentNode.next;
        }
        return result;
    }
}
