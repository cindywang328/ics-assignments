import java.util.*;
import java.io.*;
public class FUCKINGCCC2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader((System.in)));
        int j = Integer.parseInt(scan.readLine());
        int[] jerseys = new int[j];
        int a = Integer.parseInt(scan.readLine());
        int[] sizes = new int[a];
        boolean[] taken = new boolean[j];
        int count = 0;
        for(int i = 0; i < j; i++)
        {
            String s = scan.readLine();
            if(s.equals("L")) jerseys[i] = 2;
            else if (s.equals("M")) jerseys[i] = 1;
            else if(s.equals("S")) jerseys[i] = 0;
        }
        for(int i = 0; i < a; i++)
        {
            String s = scan.readLine();
            String s1 = s.substring(0,1);
            int preferredNumber = Integer.parseInt(s.substring(2,3));
            int x = -1;
            if(s1.equals("L")) x = 2;
            else if (s1.equals("M")) x = 1;
            else if(s1.equals("S")) x = 0;
            if(jerseys[preferredNumber-1] >= x && !taken[preferredNumber-1]) 
            {
                taken[preferredNumber-1] = true;
                count++;
            }
        }
       System.out.println(count);
    }
}