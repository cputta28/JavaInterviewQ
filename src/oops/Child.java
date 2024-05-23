package oops;

public class Child extends Parent {
	
	@Override
	public void m1()  {
		System.out.println("Child m1()");
	}
     // trying to override static method it not possible
	/*
	 * @Override public static void m2() { System.out.println("Parent static m2()");
	 * }
	 */
	public static void main(String[] args) throws Exception   {
		Parent parent= new Child();
		parent.m1();
	 
	}
}
