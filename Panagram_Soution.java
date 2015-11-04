// Read in a number which represents the number of cases which would be how many times I have to loop.
// Create an array of chars to check each letter against with each pass.
// Make sure to keep track of the number of times the array is looped through, this will determine what kind of panagram.
// Output the panagram to the console.

import java.util.*;
import java.io.File;
import java.io.IOException;

class Problem_B
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		int tracker = 0;	
		int cases = s.nextInt();
		String empty = s.nextLine();
		
		while(s.hasNextLine())
		{
				String sentence = s.nextLine();
				for (int k = 0; k < sentence.length(); k++)
				{
					int character = (int) sentence.charAt(k);
					int count = (character - 'a');
					if ((count >= 0) && (count < 26))
					{
					alphabet[count] = alphabet[count] + 1;
					}
					else if ((count >= -32) && (count <= -7))
					{
					alphabet[count + 32] = alphabet[count + 32] + 1;	
					}
				}
				
				int min = 2;
				
				for (int k = 0; k < 26; k++)
				{
					if(alphabet[k] < min)
					{
						min = alphabet[k];
					}
				}
				
				Results(min);
				
				for (int l = 0; l < 26; l++)
				{
					alphabet[l] = 0;
				}
				
				++tracker;
				
				if (tracker == cases)
				{
					System.exit(0);
				}
		}
	}
		
	
	static void Results(int min)
	{
	if(min == 0)
	{
		System.out.println("Not a panagram");
	}
	else if(min == 1)
	{
		System.out.println("Panagram!");
	}
	else if(min == 2)
	{
		System.out.println("Double panagram!!");
	}
	else if(min == 3)
	{
		System.out.println("Triple panagram!!!");
	}
	}
	
}
