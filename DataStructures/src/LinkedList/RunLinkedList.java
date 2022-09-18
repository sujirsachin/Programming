package LinkedList;

import java.util.Arrays;

public class RunLinkedList {
    public static void main(String args[])
    {
        var list = new LinkedList<Integer>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(111);
        System.out.println("Index: "+list.indexOf(30));
        System.out.println("Contains: "+list.contains(10));
        //list.removeFirst();
        //list.removeLast();
        System.out.println("Count: "+list.sizeOf());
        int result[] = list.toArray();
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
        //list.printList();
        list.reverseList();

        System.out.println(list.kthNode(5));
        list.addLast(555);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        var array2 = list.middle();
        System.out.println(Arrays.toString(array2));
    }
}
