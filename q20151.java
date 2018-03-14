import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q20151
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        int sum = 0;
        int x = 0;
        int[] array2 = new int[k];
        int lastIndex = 0;
        for(int i = 0; i<k; i++)
    {
        array[i] = scan.nextInt();
    }
    for(int i = 0; i<k; i++)
    {
        if(array[i] != 0)
        {
            array2[lastIndex] = array[i];
            lastIndex++;
            
        }
        else
        {
            array2[lastIndex-1] = 0;
            lastIndex--;
        }
    }
    for(int i: array2)
    {
        sum += i;
    }
    
    System.out.println(sum);
    }
}
