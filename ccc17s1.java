
/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ccc17s1
{
    

   

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 0;
        int[] array1= new int[n];
        int[] array2 = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<n; i++)
        {
            array1[i] = s.nextInt();
        }
        for(int i = 0; i<n; i++)
        {
            array2[i] = s.nextInt();
        }
        for(int i = 0;i<n; i++)
        {
            sum1=sum1+array1[i];
            sum2=sum2+array2[i];
            if(sum1==sum2) k = i+1;
        }
        System.out.println(k);
    }
}
