import java.util.Scanner;
public class Question9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("5 numbers? ");
		int i = 0;
		for (int j = 1; j <= 5; j++)
		{
			i = i + sc.nextInt();
		}
		
		float f = i;
		System.out.println(f/5);
	}

}
