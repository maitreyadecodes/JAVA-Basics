package Inheritance;

class Grandparent
{
	void sleep()
	{
		System.out.println("Grandparent class is called. He is sleeping.");
	}
}

class Parent extends Grandparent
{
	void work()
	{
		System.out.println("Parent class is called. He is working.");
	}
}

class Son extends Parent
{
	void see()
	{
		System.out.println("Son is seeing all this.");
	}
}

public class MultilevelInheritance 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.sleep();
		s.work();
		s.see();
	}
}
