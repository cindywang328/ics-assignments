import java.io.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRICKIN2015s3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int g = Integer.parseInt(b.readLine());
        int p = Integer.parseInt(b.readLine());
        boolean[] taken = new boolean[p];
        
        for(int i = 0; i<p; i++)
        {
            int number = Integer.parseInt(b.readLine());
            int maxGate = number-1;
            while( maxGate>=0 && taken[maxGate])
            {
                maxGate--;
            }
            if(maxGate<0) break;
            taken[maxGate] = true;
            count++;
        }
        System.out.println(count);
    }
    
}
