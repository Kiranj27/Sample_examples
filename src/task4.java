import java.lang.System;
import java.lang.Math;
import java.util.Scanner;
public class task4{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The value of Centigrade is: ");
		float Centigrade = scan.nextFloat();
		float Farenheit = Centigrade*(9/5)+32;
		System.out.println("The temperature in Farenheit is: "+Farenheit);
	
	}
}