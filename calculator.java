package Introduction;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first operator ");
			float op1 = sc.nextFloat();
			
			System.out.print("Enter second operator ");
			float op2 = sc.nextFloat();
			
			System.out.print("Choose operator number (1-4):\n1. Addition\n2. Subtraction\n3. Multiplication\n4.Operator");
			int operator = sc.nextInt();
			
			switch (operator)
			{
			case 1:
				System.out.println(op1 + op2);
			break;
			
			case 2:
				System.out.println(op1 - op2);
			break;
			
			case 3:
				System.out.println(op1 * op2);
			break;
			
			case 4:
				if (op2 == 0)
					System.out.println("Error: Numbers not divisible by 0");
				else
					System.out.println(op1 / op2);
			break;

			default:
				System.out.println("INVALID OPERATOR");
			}
		sc.close();
		}
	}

}
