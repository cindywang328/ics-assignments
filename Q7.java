package JavaReview3;
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence? ");
		String x = sc.nextLine();
		System.out.println("String? ");
		String y = sc.nextLine();
		
		while(x.indexOf(y)>0)
		{
			int i = x.indexOf(y);
			int j = y.length();
			x = x.substring(0, i) + x.substring(i + j);
		}
		System.out.println(x);
	}
	

}
