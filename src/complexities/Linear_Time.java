package complexities;

public class Linear_Time 
{
    int evenCount = 0;

    public int returnEvenNumbers(int[] array)
    {
        if(array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        else
        {
            for(int i : array)
            {
                if(array[i] % 2 == 0)
                {
                    return evenCount++;
                }
            }
        }

        return 0;
    }
    
    public void runDemo(int[] array)
    {
        returnEvenNumbers(array);
    }
}
