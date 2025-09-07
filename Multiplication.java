package Introduction;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		System.out.println("Multiplication Table of" + num);
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(num + " x " + i + " = " + (num * i));
		}
		sc.close();
	}

}
