import java.io.*;
import java.util.*;

public class Tides
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        
       String[] input = b.readLine().split(" ");
       int[] list = new int[n];
       for(int i = 0; i<n; i++)
       {
           list[i] = Integer.parseInt(input[i]);
        }
        
       Arrays.sort(list);
       
       if(n%2 == 0)
       {
           int[] low = new int[n/2];
           for(int i = 0; i<n/2; i++)
           {
               low[i] = list[n/2-i-1];
            }
           int[] high = new int[n/2];
           for(int i = n/2; i<n; i++)
           {
               high[i-n/2] = list[i];
            }
           
            for(int i = 0; i<n/2; i++)
            {
                System.out.print(low[i]+" "+high[i]+" ");
            }
        }
        else
        {
            int[] low = new int[n/2+1];
           for(int i = 0; i<n/2+1; i++)
           {
               low[i] = list[n/2-i];
            }
            int[] high = new int[n/2];
           for(int i = n/2+1; i<n; i++)
           {
               high[i-n/2-1] = list[i];
            }
            for(int i = 0; i<n/2; i++)
            {
                System.out.print(low[i]+" "+high[i]+" ");
            }
            System.out.print(low[low.length-1]);
        }
    }
}