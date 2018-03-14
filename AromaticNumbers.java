import java.io.*;
import java.util.*;

public class AromaticNumbers

{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] input = b.readLine().split("");
        int sum = 0;
        if(input.length > 2)
        {
            for(int i = 0;i<input.length-3;i+=2)
            {
                int nextR = value(input[i+3]);
                int thisR = value(input[i+1]);
                if(nextR>thisR)
                {
                    sum -= Integer.parseInt(input[i])*value(input[i+1]);
                }
                else
                {
                    sum += Integer.parseInt(input[i])*value(input[i+1]);
                }
            }
            sum += Integer.parseInt(input[input.length-2])*value(input[input.length-1]);
        System.out.println(sum);
        }
        else
        {
            System.out.println(Integer.parseInt(input[0])*value(input[1]));
        }
        
    }
    
    public static int value(String s)
    {
        if(s.equals("I")) return 1;
        else if(s.equals("V")) return 5;
        else if(s.equals("X")) return 10;
        else if(s.equals("L")) return 50;
        else if(s.equals("C")) return 100;
        else if(s.equals("D")) return 500;
        else  return 1000;
    }
}