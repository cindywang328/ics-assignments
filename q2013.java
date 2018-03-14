import java.io.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2013
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(b.readLine());
        int k = 1;
        boolean distinct = false;
        while(!distinct)
        {
            String[] s = ((y+k)+"").split("");
            distinct = true;
            for(int i = 0; i<s.length;i++)
            {
                
                for(int j = i+1; j<s.length; j++)
                {
                    
                    if(s[i].equals(s[j]) && j != i)
                    {
                        distinct = false;
                    }
                }
            }
            k++;
        }
        System.out.println(y+k-1);
    }
}
