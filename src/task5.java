import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;

public class task5{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	float Principal, rate, n, time;
	System.out.println("Enter the Principal amount: ");
	Principal=scan.nextFloat();
	System.out.println("Enter the rate of interest: ");
	rate=scan.nextFloat();
	System.out.println("Enter the value of n: ");
	n=scan.nextFloat();
	System.out.println("Enter the value of time: ");
	time=scan.nextFloat();
	double CompoundInterest=Principal*(Math.pow((1+(rate/n)), (n*time)));
	System.out.println("The Compound Interest is: " +CompoundInterest);
	}
	}