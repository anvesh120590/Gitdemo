package concept;

import java.util.Arrays;

public class smallestandlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]={22,15,8,4,999};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
			
		}
		System.out.println("\n The given array is:"+Arrays.toString(numbers));
		System.out.println("Largest num is ::"+largest);
		System.out.println("Smallest num is::"+smallest);
	
	}

}
