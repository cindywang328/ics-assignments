import java.util.*;

public class FUCKINGHELL
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int j = Integer.parseInt(scan.nextLine());
        
        String[] array1 = new String[j];
        
        int count = 0;
        int a = Integer.parseInt(scan.nextLine());
        String[] array2 = new String[a];
        int[] array3 = new int[a];
        for(int i = 0; i < j; i++)
        {
            array1[i] = scan.nextLine();
            
        }
        for(int i = 0; i < a; i++)
        {
            String s = scan.nextLine();
            
            array2[i] = s.substring(0,1);
            array3[i] = Integer.parseInt(s.substring(2,3));
        }
        for(int i = 0; i <a; i++)
        {
            String js = array1[array3[i]-1];
            if(js.equals(array2[i])||array2[i].equals("S")
            ||(js.equals("L") && array2[i].equals("M")))
            {
                count++;
                array1[array3[i]-1] = "T";
            }
        }
        System.out.println(count);
    }
    
}
