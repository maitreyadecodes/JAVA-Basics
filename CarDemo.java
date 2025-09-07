package Constructors;

class Car
{
	String brand;
	String model;
	double price;
	
	Car(String brand, String model, double price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Brand: " + brand + " Model: " + model + " Price: " + price);
		//System.out.println("-----------------------");
	}
}
public class CarDemo 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("Ferrari", "812 GTS", 5800000);
		Car c2 = new Car("Lamborghini", "Revuelto", 8900000);
		
		c1.display();
		c2.display();

	}

}
