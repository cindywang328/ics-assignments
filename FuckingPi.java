import java.io.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FuckingPi
{
    
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        int k = Integer.parseInt(b.readLine());
        
        System.out.println(f(1, n, k));
    }
    
    public static int f(int start, int n, int k)
    {
        
            if(k == 1)return 1;
            else if(k == n) return 1;
            else
            {
                int sum = 0;
                for(int i = start; i<n/k+1; i++)
                {
                    
                    sum+=f(i, n-i, k-1);
                }
                return sum;
            }
        }
        
        
    }

    

