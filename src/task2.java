import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;
public class task2{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double r, h ,Area;
		System.out.println("Enter the value of r ");
		r = scan.nextDouble();
		System.out.println("Enter the value of h ");
		h = scan.nextDouble();
		Area = 2*(Math.PI)*r*(r+h);
		System.out.println("The Area of a Cylinder is "+Area);
	}
}