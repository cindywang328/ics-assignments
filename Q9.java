package JavaReview3;
import java.util.Scanner;
public class Q9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double p = 1/ norm(a, b, c);
		double q = norm(a*a, b*b, c*c);
		double r = norm(2*a, 3*b, 5*c);
		double s = norm(Math.pow(3, 0.5)*a, 0, 0)
				* norm(Math.pow(12, 0.5)*b, 0, 0) 
				* norm(Math.pow(27, 0.5)*c, 0, 0);
		
		System.out.println(p + " "+q+" "+r+" "+s);
	}
	public static double norm(double x, double y, double z)
	{
		return Math.pow((x*x + y*y + z*z), 0.5);
	}

}
