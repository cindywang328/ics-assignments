import java.util.Scanner;
public class Question3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("String? ");
		String s = sc.nextLine();
		System.out.println("Character? ");
		char c = sc.next().charAt(0);
		System.out.println("Integer? ");
		int i = sc.nextInt();
		System.out.println("Float? ");
		float f = sc.nextFloat();
		
		System.out.println("String: " + s + "\n"
				+"Char: " + c + "\n"
				+"Int: " + i + "\n"
				+"Float: " + f);
	}

}
