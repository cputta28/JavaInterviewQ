package exception;

public class ExceptionOrdr {

	public static void main(String[] args)   {

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae  ) {
			System.out.println(ae.getLocalizedMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}

	}
}
