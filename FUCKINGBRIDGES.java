import java.io.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FUCKINGBRIDGES
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int maxWeight = Integer.parseInt(b.readLine());
        int numTrains = Integer.parseInt(b.readLine());
        int[] list = new int[numTrains+3];
        list[0]=(0);
        list[1]=(0);
        list[2]=(0);
        for(int i = 3; i<numTrains+3; i++)
        {
            list[i]=Integer.parseInt(b.readLine());
        }
        
        int count = 0;
        for(int i = 3; i<numTrains+3; i++)
        {
            int sum = list[i]+list[i-1]+list[i-2]+list[i-3];
            if(sum>maxWeight) break;
            count++;
        }
        System.out.println(count);
        
    }
}
