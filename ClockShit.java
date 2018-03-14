import java.io.*;
import java.util.*;

public class ClockShit
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(b.readLine());
         if(input <= 720)
         {
            int count = 0;
            for(int i = 0; i<=input; i++)
            {
                    int hours = (i)/60;
                int minutes = (i) % 60;
                int h;
                int m = minutes;
                if(input < 60) h = 12;
                else 
                {h = (12+hours)%12;
                if(h == 0) h = 12;}
                if(m>=10)
                    {if(checkSequence(h+""+m)) count++;}
                else {if(checkSequence(h+"0"+m))count++;}
            }
            System.out.println(count);
        }
        else
        {
            int numTimes = input/720;
            input = input%720;
            int count = 0;
            
            for(int i = 0; i<=input; i++)
            {
                    int hours = (i)/60;
                int minutes = (i) % 60;
                
                
                int h;
                int m = minutes;
                if(input < 60) h = 12;
                else 
                {h = (12+hours)%12;
                if(h == 0) h = 12;}
                
                
                if(m>=10)
                    {if(checkSequence(h+""+m)) count++;}
                else {if(checkSequence(h+"0"+m))count++;}
            }
            
            
            System.out.println(count+numTimes*31);
        }
    }
    public static boolean checkSequence(String input)
    {
        String[] s = input.split("");
        if(s.length == 3)
        {
            return (Integer.parseInt(s[1])-Integer.parseInt(s[0]) 
            == Integer.parseInt(s[2])-Integer.parseInt(s[1]));
        }
        else if(s.length == 4)
        {
            return (Integer.parseInt(s[1])-Integer.parseInt(s[0]) 
            == Integer.parseInt(s[2])-Integer.parseInt(s[1]) 
            && Integer.parseInt(s[3])-Integer.parseInt(s[2]) 
            == Integer.parseInt(s[2])-Integer.parseInt(s[1]));
        }
        return false;
    }

}
