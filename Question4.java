import java.util.Scanner;
public class Question4 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Integer between 0 and 1000? ");
	int i = sc.nextInt();
	int h = i/100;
	int t = i/10 - 10*h;
	int o = i - 100*h - 10*t;
	System.out.println("hundreds: " + h + " tens: " + t + " ones: " + o);
	}
}
