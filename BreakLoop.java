package Introduction;

import java.util.Scanner;

public class BreakLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Type key element: ");
		int key = sc.nextInt();
		
		boolean found = false;
		
		for (int i = 0; i < size; i++)
		{
			if(key == arr[i])
			{
				found = true;
				break;
			}
		}
		
		if (found)
		{
			System.out.println("Key element found in array");
		}
		else
		{
				System.out.println("Key element not found.");
		}
		sc.close();
	}
}

