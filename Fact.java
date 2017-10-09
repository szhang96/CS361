public class Fact {
	public static int fact(int n) {	
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return n;
		} else {
			return fact(n - 1) * n;
		}
	}
}
	

