package Constructors;

class Book
{
	String title;
	float price;
	
	Book()
	{
		title = "Mi Shastradnya Kasa Zalo?";
		price = 400;
	}
	
	void display()
	{
		System.out.println("Title of the book: " + title + "\n" + "Price of the book: " + price);
	}
}

public class BookDemo
{
	public static void main(String[] args) 
	{
		Book b = new Book();
		b.display();
	}
}
