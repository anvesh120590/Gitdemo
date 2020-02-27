package concept;

import java.util.HashSet;
import java.util.Set;

public class DupHashSet {

	public static void main(String[] args) {
		
		String names[]={"java","cpp","python","java", "cpp"};
		
		Set<String> stored = new HashSet<String>();
		
		for(String Str: names)
		{
			if(stored.add(Str)== false)
			{
				System.out.println("The dulicate  elements: "+ Str);
			}
				
		}
			
		
		
	}
	}