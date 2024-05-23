package in.winny;

final class CustomImmutable {
 final int a=20;
 public void m1() {
	// a=13;
 }
 private int b=20;
 public static void main(String[] args) {
	 CustomImmutable customImmutable= new CustomImmutable();
	 System.out.println(customImmutable.a);
	 System.out.println(customImmutable.b);
}
}
