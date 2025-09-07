package Introduction;

import java.util.Scanner;

public class SumOfDigs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int og = num;
		
		while (num > 0)
		{
			int dig = num % 10;
			sum = sum + dig;
			num = num / 10;
		}
		System.out.println("The sum of digits of " + og + " is: " + sum);
		
		sc.close();
	}

}
