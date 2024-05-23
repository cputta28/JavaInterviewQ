package in.winny;

public class TestImmutableString {
	public static void main(String[] args) {
		String s = "Java";
		s.concat("Techie");// cancate() method appends the strings
		System.out.println(s);// it will print java because string is immutable objects
		
		
		String password = "pwd";
		password.concat("123");
		System.out.println(password);
		
		StringBuffer sb=new StringBuffer("Chandra ");
		sb.append("Shekar");
		System.out.println(sb);
		
		StringBuilder br=new StringBuilder("Winny.");
		br.append( "Tech");
		System.out.println(br);
	}
}
