package concept;

public class Maxino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	245
		347
		129*/
		
		int abc[][]={{2,4,5},{3,4,7},{1,2,7}};
		
		int min=abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
		}
		
		System.out.println(min);
		
		
		
		}

}
