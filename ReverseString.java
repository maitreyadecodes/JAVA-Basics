package Constructors;

import java.util.Scanner;

public class ReverseString 
{
    static String reverse(String str, int index) 
    {
        if (index < 0) 
        {
            return "";
        }
        return str.charAt(index) + reverse(str, index - 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverse(input, input.length() - 1);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}