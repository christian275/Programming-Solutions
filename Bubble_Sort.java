/* Christian Ropchock
 * 02-03-2016
 * 
 * This project will demonstrate the use of sorting an array of numbers
 * using the bubble sort approach by reading in an array of ten doubles
 * and compares these values to their neighbors until the smaller numbers
 * "float to the top".
 * 
*/

import java.util.Scanner;
import java.util.Arrays;

public class Bubble_Sort
{
	public static void main(String[] args)
	{
		// Ask the user to input 10 values and store them into an array 
		// of double[]
		
		Scanner input = new Scanner(System.in);
		
		double[] values = new double[10];
		
		for (int count = 0; count < 10; count++)
		{
			System.out.print("Value " + (count + 1) + ": ");
			values[count] = input.nextDouble();
		}
		
		System.out.print("Your array before the bubble sort: ");
		printArray(values);
		
		// Create a method that takes this array and checks each pair of 
		// numbers
		
		bubble(values);
		
		// Print out the solution
		
		System.out.print("\nYour array after the bubble sort: ");
		printArray(values);
		
	}
	
	public static void printArray(double[] values)
	{
		for (double e: values)
		{
			System.out.print(e  + " ");
		}
	}
	
	public static void bubble(double[] values)
	{
		for (int passes = 0; passes < values.length; passes++)
		{
			for (int count = 0; count < values.length - 1; count++)
			{
				compare(values, count);
			}
		}
	}
	
	public static void compare(double[] values, int count)
	{
		double temp = 0;
		if (values[count] > values[count + 1])
		{
			temp = values[count];
			values[count] = values[count + 1];
			values[count + 1] = temp;
			return;
		}
		else return;
	}
	
}
