package complexities;

public class Logarithmic_Time 
{
    public void findSpecificNumber(int[] array, int n)
    {
        if(array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        else
        {
            int first = 0;
            int last = array.length - 1;
            int middle;
            boolean found = false;

            while(!found)
            {
                middle = (last + first) / 2;

                if(n > array[middle])
                {
                    first = middle + 1;
                }

                if(n < array[middle])
                {
                    last = middle -1;
                }
                else
                {
                    System.out.println(n + " found at index " + middle);
                    found = true;
                }
            }

            if(!found)
            {
                System.out.println("Number was not found in the array");
            }
        }
    }

    public void runDemo(int[] array, int n)
    {
        findSpecificNumber(array, n);
    }
}
