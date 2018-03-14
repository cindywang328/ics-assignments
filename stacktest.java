import java.util.*;
public class stacktest
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();
        s.push("a");
        s.push("b");
        for(int i = 0; i<3; i++) s.push(i+"");
        System.out.println(s.pop()+" "+s.empty()+" "+s.search("b"));
        
    }
}