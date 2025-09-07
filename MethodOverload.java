package Constructors;

class Calculator
{
	int add(int a, int b)
	{
		return a + b;
	}
	
	double add(double a, double b)
	{
		return a + b;
	}
}
public class MethodOverload 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		System.out.println("Integer Addition: " + c.add(3, 5));
		System.out.println("Double Addition: " + c.add(3.5, 5.5));
	}
}
