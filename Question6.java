import java.util.Scanner;

public class Question6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Year? ");
		int y = sc.nextInt();
		
		int p = y/100;
		int q = y - 19 * (y/19);
		int r = (p - 17)/25;
		int s = p - (p/4) - (p-r)/3 + 19*q + 15;
		s = s - 30*(s/30);
		s = s - (s/28)*(1 - (s/28)*29/(s+1)*(21-q)/11);
		int t = y + y/4 + s + 2 - p + p/4;
		t = t-7*(t/7);
		int u = s-t;
		int m = 3 + (u + 40)/44;
		int d = u + 28 - 31*(m/4);
		
		System.out.println("month: "+ m + ", day: " + d);
				
	}
}