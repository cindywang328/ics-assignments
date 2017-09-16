package JavaReview3;
import java.util.Scanner;

public class Q6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("string? ");
		String s = sc.nextLine();
		int n = 0;
		
		if(s.length() > 10)
		{
			n = 10;
			s = s.substring(0,  10);
		}
		else
		{
			n = s.length();
		}
		
		for(int i = 1; i <= n; i++)
		{
		
				for(int k = 1; k <= (n-i); k++)
				{
					System.out.print(" ");
				}
				
				for(int k = 0; k<i; k++)
				{
					if(i == 1)
					{
						System.out.println(s.charAt(k));
					}
					else
					{
						System.out.print(s.charAt(k));
					}
				}
				
				for(int k = (i - 2); k >= 0; k--)
				{
					if(k == 0)
					{
						System.out.println(s.charAt(k));
					}
					else
					{
						System.out.print(s.charAt(k));
					}
				}
			
		}
		
		for(int i = s.length()-1; i >=1; i--)
		{
		
				for(int k = 1; k <= (n-i); k++)
				{
					System.out.print(" ");
				}
				
				for(int k = 0; k<i; k++)
				{
					if(i == 1)
					{
						System.out.println(s.charAt(k));
					}
					else
					{
						System.out.print(s.charAt(k));
					}
				}
				
				for(int k = (i - 2); k >= 0; k--)
				{
					if(k == 0)
					{
						System.out.println(s.charAt(k));
					}
					else
					{
						System.out.print(s.charAt(k));
					}
				}
			
		}
	}

}
