import java.util.*;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       
        String s1 = scan.nextLine();
        char[] array1 = s1.toCharArray();
        String s2 = scan.nextLine();
        char[] array2 = s2.toCharArray();
        int[] countArray = new int[26];
        int[] countArray2 = new int[26];
        boolean b = true;
        for(char c: array1)
        {
            countArray[c-97]++;
        }
        for(char c: array2)
        {
            if(c >= 97 && c <= (122))
            {
                countArray2[c-97]++;
            }
            
        }
        for(int i = 0; i<countArray.length;i++)
        {
            if(countArray2[i] > countArray[i]) b = false;
            
        }
        
        if(b) System.out.println("A");
        else System.out.println("N");
    }
}
