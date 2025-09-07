package Constructors;

class Person
{
	String name;
	int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class Employee extends Person
{
	int Employee_ID;
	double salary;
	
	Employee(String name, int age, int Employee_ID, double salary)
	{
		super(name, age);
		this.Employee_ID = Employee_ID;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Name: " + name + " Age: " + age + " ID: " + Employee_ID + " Salary: " + salary); 
	}
}

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Maitreya More", 19, 101, 2000000);
		Employee emp2 = new Employee("Prajakta Mali", 28, 102, 1000000);
		
		emp1.display();
		emp2.display();
	}
}
