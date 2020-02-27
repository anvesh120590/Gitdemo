package concept;

public class Test implements A,B {

	@Override
	public void m1() {
		
		
	    A.super.m1();
		B.super.m1();
	}
	
	public static void main(String[]args){
		
		Test t=new Test();
		t.m1();
		
	}

	

}
