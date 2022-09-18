package Hash;

import java.util.HashMap;

public class MostRepeated {

    public int findMostRepeatedNumber(int[] numbers)
    {
        HashMap<Integer, Integer> hashNumbers = new HashMap<>();
        int max=0;
        int number = 0;
        int result = 0;
        for(int i=0; i<numbers.length; i++)
        {
            if(!hashNumbers.containsKey(numbers[i]))
                hashNumbers.put(numbers[i],0);
            else
            {
                number = hashNumbers.get(numbers[i]) + 1;
                if(max < number)
                {
                    max = number;
                    result = numbers[i];
                }
                    
                hashNumbers.put(numbers[i],number);
            }

        }
        return result;
    }
}
