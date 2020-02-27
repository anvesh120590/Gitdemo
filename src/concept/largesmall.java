package concept;

import java.util.Arrays;

public class largesmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={2,5,9,87,0};
		
		int largest=num[0];
		int smallest=num[0];
		
		
		for (int i=1;i<num.length;i++){
			if(num[i]>largest){
				largest=num[i];
			}
			else if (num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("The give array is "+ Arrays.toString(num));
		System.out.println("largest :"+ largest);
		System.out.println("Smallest :"+smallest);
		
		
		

	}

}
