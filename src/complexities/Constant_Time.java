package complexities;

public class Constant_Time 
{
    public static void getFirstElement(int[] array)
    {
        if(array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        else
        {
            System.out.println("The number at index 0 is " + array[0]);
        }
    }

    public static void runDemo(int[] array)
    {
        getFirstElement(array);
    }
}
