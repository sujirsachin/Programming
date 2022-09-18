package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        Array items = new Array(2);
        items.insert(2);
        items.insert(3);
        items.insert(4);
        items.insert(6);
        items.removeAt(0);
        System.out.println("Index "+items.indexOf(6));
        System.out.println("Max "+items.max());
        //items.printElements();

        int[] array = {0,5,6,4};
        ArrayList<Integer> temp = items.intersect(array);
        for (int i=0;i<temp.size();i++)
        {
            System.out.println(temp.get(i));
        }
    }
}
