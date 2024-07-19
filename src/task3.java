import java.util.Scanner;
public class task3{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double s;
		System.out.println("The value of r is: ");
		float r = scan.nextFloat();
		System.out.println("The value of h is: ");
		float h = scan.nextFloat();
		s=Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2));
		double Area=Math.PI*r*(r+s);
		System.out.println("The Area of a cone is: "+Area);
	
	}
}