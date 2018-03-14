import java.io.*;
import java.util.*;
/**
 * Write a description of class qwp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        String[] s1 = b.readLine().split(" ");
        int[] swifts = new int[n];
        for(int i = 0; i<n; i++)
        {
            swifts[i] = Integer.parseInt(s1[i]);
        }
        String[] s2 = b.readLine().split(" ");
        int[] sem = new int[n];
        for(int i = 0; i<n; i++)
        {
            sem[i] = Integer.parseInt(s2[i]);
        }
        int sum1 = 0;
        int sum2 = 0;
        int k = 0;
        for(int i = 0; i<n; i++)
        {
            sum1 += swifts[i];
            sum2 += sem[i];
            if(sum1 == sum2) k = i+1;
        }
        System.out.println(k);
    }
}