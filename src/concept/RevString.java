package concept;

public class RevString {

	public static void main(String[] args) {
		
		String Orignalstr = "Anvesh"; 
		String ReverseStr = "";
		for(int i=Orignalstr.length()-1 ; i >=0;i--)
		{			
			ReverseStr =ReverseStr + Orignalstr.charAt(i);
			
		}
		System.out.println( ReverseStr);		

	}

}
