import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter the lengths of the three sides of the triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2; // Calculate the semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Calculate the area using Heron's formula

        System.out.println("The area of the triangle is: " + area); // Output the result
    }
}