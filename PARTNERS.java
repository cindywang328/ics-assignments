import java.io.*;
public class PARTNERS
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        String[] a1 = b.readLine().split(" ");
        String[] a2 = b.readLine().split(" ");
        boolean good = true;
       int i = 0;
       while(i<n && good)
       {
           int p = position(a1, a2[i]);
           if(p < 0) good = false;
           if(!a1[i].equals(a2[p]) || a1[i].equals(a2[i])) good = false;
           i++;
       }
       if(good) System.out.println("good");
       else System.out.println("bad");
    }
    public static int position(String[] first, String second)
    {
        for(int i = 0; i<first.length; i++)
        {
            if(first[i].equals(second)) return i;
        }
        return -1;
    }
    
}
//first[i] = second[position in first of second[i]]
