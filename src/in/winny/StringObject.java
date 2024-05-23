package in.winny;

public class StringObject {

	public static void main(String[] args) {
//we can create two ways 1:-literal,
//		                 2:-by using new keyWord

		String s2 = new String("Rama");
		// 1 object -> new -> heap
		// 2 object -> literal -> scp
		String s1 = "Rama";// 1 object
//intern method is used to get reference from scp	 
		System.out.println(s1.intern());
		System.out.println(s1.intern().hashCode() == s2.hashCode());

	}
}