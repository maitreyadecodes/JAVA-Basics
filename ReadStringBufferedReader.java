package Constructors;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadStringBufferedReader 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = reader.readLine();  
        System.out.println("You entered: " + input);
    }
}