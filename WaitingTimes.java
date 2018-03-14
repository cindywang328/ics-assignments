import java.io.*;

public class WaitingTimes
{
    
   
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int[] times = new int[100];
        boolean[] waiting = new boolean[100];
        int m = Integer.parseInt(b.readLine());
        for(int i = 0; i<m; i++)
        {
            String[] input = b.readLine().split(" ");
            String s = input[0];
            int number = Integer.parseInt(input[1])-1;
            if(s.equals("R"))
            {
                waiting[number] = true;
                
                for(int j = 0; j<100; j++)
                {
                    if(waiting[j]) times[j]++;
                }
            }
            else if(s.equals("W"))
            {
                for(int j = 0; j<100; j++)
                {
                    if(waiting[j]) times[j]+=number;
                }
            }
            else if(s.equals("S"))
            {
                waiting[number] = false;
                
                for(int j = 0; j<100; j++)
                {
                    if(waiting[j]) times[j]++;
                }
            }
            
        }
        // if still waiting, its -1
        for(int i = 0; i<100; i++)
        {
            if(times[i] != 0 && !waiting[i]) System.out.println((i+1)+" "+times[i]);
            else if(times[i] != 0 && waiting[i]) System.out.println((i+1)+" "+"-1");
            
        }
    }
}
