package in.winny;

public class FinalFinallyFinalize {
	 

	private final int a =10;
	public void m1(){
		 
	//a=20;//can't reassign
		
	try {
	System.out.println("try block");
	} 
	finally  {
		System.out.println("finally block");}
	}
	@Override
	protected void finalize() throws Throwable {
	
	System.out.println("finalize method called...");
	}
	 public static void main(String[] args) {
		 FinalFinallyFinalize fl=new FinalFinallyFinalize();
		 System.out.println(fl.a);
		 fl.m1();
		 fl=null;
		 System.gc();
	}

}
