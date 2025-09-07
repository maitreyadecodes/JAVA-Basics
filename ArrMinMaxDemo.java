package Constructors;

import java.util.Scanner;

class ArrMinMax 
{
    int[] arr;

    ArrMinMax(int[] arr)
    {
        this.arr = arr;
    }

    void findMinMax() 
    {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

public class ArrMinMaxDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
   
        ArrMinMax processor = new ArrMinMax(arr);
        processor.findMinMax();

        sc.close();
    }
}