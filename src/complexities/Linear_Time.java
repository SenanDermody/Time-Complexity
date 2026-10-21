package complexities;

public class Linear_Time 
{
    int evenCount = 0;

    public void returnEvenNumbers(int[] array)
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
                    evenCount++;
                }
            }
        }

        if(evenCount == 0)
        {
            System.out.println("No even numbers found in the array");
        }
        else
        {
            System.out.println(evenCount + " even numbers were found in the array");
        }
    }
    
    public void runDemo(int[] array)
    {
        returnEvenNumbers(array);
    }
}
