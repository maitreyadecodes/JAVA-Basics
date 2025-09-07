package Inheritance;

class Rectangle
{
    int length;
    int breadth;

    Rectangle()
    {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    int area()
    {
        return length * breadth;
    }
}

public class Area
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);

        System.out.println("Area of r1: " + r1.area());
        System.out.println("Area of r2: " + r2.area());
    }
}