/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\Shirley\\workspace\\ParserScanner\\src\\op1.jay";
	private static int counter = 1;
	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
		Token t;
		TokenStream[] tests = new TokenStream[7];

		//read code and return all tokens
		while (!ts.isEndofFile()) {
			System.out.println("Counter = " + counter);
				t = ts.nextToken();
				
				System.out.println(t.toString());
				System.out.println();
				counter++;
		}

		
		
	}
}
