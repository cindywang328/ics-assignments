import java.io.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class combination
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(b.readLine());
        System.out.println((j-1)*(j-2)*(j-3)/6);
    }
}
