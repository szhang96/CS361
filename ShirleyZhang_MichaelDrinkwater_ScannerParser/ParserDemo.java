
public class ParserDemo {

	public static void main(String[] args) {
		//TokenStream tStream = new TokenStream(args[0]);
		String file1 = "C:\\Users\\Shirley\\workspace\\ParserScanner\\src\\ifElse.jay";
		TokenStream tStream = new TokenStream(file1);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}

