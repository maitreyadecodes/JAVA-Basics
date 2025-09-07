package Introduction;

import java.util.Scanner;

//Q9

public class voteage 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			int age = sc.nextInt();
			
			System.out.print("Do you have a voter ID? Type true for Yes and false for No: ");
			boolean ID = sc.nextBoolean();
			
			if (age >= 18)
				if (ID)
					System.out.println("You are eligible to vote!");
				else
					System.out.println("You do not have adequate ID");
			else
				System.out.println("Not eligible as age less than 18.");
			sc.close();
		}
	}
}
