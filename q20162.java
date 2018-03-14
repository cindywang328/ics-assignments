import java.util.*;
import java.lang.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class q20162
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    int n = scan.nextInt();
    int[] d = new int[n];
    int[] p = new int[n];
    for(int i = 0; i<n;i++)
    {
        d[i] = scan.nextInt();
    }
    for(int i = 0; i<n;i++)
    {
        p[i] = scan.nextInt();
    }
    Arrays.sort(d);
    Arrays.sort(p);
    int s = 0;
    if(q==1)
    {
        for(int i = 0; i<n;i++)
        {
            s += max(d[i], p[i]);
        }
        System.out.println(s);
    }
    if(q == 2)
    {
        for(int i = 0; i<n;i++)
        {
            s += max(d[i], p[n-1-i]);
        }
        System.out.println(s);
        
    }
}
public static int max(int a, int b)
{
    if(a>b) return a;
    else return b;
}
   
    
}
