package concept;

public class Duplicates {

	public static void main(String[] args) {
		
		String name[]={"java","cpp","python","java", "cpp"};
		
		for(int i=0; i<name.length;i++){
			
			for(int j= i+1; j<name.length; j++){
				
				if(name[i].equals(name[j])){
					
					System.out.println("Duplicats:  "+name[i]);
					
				}
				
			}
			
			
		}
			
	}

}
