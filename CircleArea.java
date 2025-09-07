package Introduction;

import java.util.Scanner;

public class CircleArea 
{
	public static final double PI = 3.14159;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of circle ");
		double rad = sc.nextDouble();
		
		double area = PI * rad * rad;
		
		System.out.println("Area of circle is: " + area);
		sc.close();
	}
}
