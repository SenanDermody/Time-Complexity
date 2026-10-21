package complexities;

public class Constant_Time 
{
    public static int getFirstElement(int[] array)
    {
        if(array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        else
        {
            return array[0];
        }
    }

    public static void runDemo(int[] array)
    {
        getFirstElement(array);
    }
}
