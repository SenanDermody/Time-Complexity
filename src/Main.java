import complexities.Constant_Time;
import complexities.Linear_Time;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        while(n < 0 && n > 50000)
        {
            n = scanner.nextInt();
        }

        scanner.close();

        int[] array = new int[n];

        for(int i = 0; i < array.length; i++)
        {
            Random r = new Random();
            int r1 = r.nextInt(100);
            array[i] = r1;
        }

        Constant_Time.runDemo(array);
        Linear_Time.runDemo(array);
    }
}
