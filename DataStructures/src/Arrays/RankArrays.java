package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RankArrays {
    public static int[] arrayRankTransform(int[] arr)
    {
        int[] temp = Arrays.copyOf(arr,arr.length);
        int rank = 1;
        HashSet<Integer> a= new HashSet<>();
        HashMap<Integer, Integer> values = new HashMap<>();
        Arrays.sort(temp);
        for(int i=0; i<temp.length;i++)
        {
            if(!values.containsKey(temp[i]))
            {
                values.put(temp[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = values.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[]{40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(array)));
    }
}
