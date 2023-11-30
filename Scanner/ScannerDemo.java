
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "/Users/juliatretyakov/Desktop/cs361/Scanner";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			if (tk != null) {
				System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
			}
		}
	}