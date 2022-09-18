import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsKey(target-nums[i]))
            {
                return new int[]{i,hash.get(target-nums[i])};
            }
            if(!hash.containsKey(nums[i]))
                hash.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(array,target)));
    }
}
