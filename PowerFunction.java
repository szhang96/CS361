public class PowerFunction {
	public static int recPow(int n) {
		if (n < 0)
			throw new IllegalArgumentException("n should be greater than O");
		else if (n > 30)
			throw new IllegalArgumentException("n should be less than 31");
		else if (n == 0)
			return 1;
		else 
			return 2* recPow(n-1);
	}
	public static void main(String[] args) {
		int i;
		System.out.println(("2^-1" + " = "  + recPow(-1)));//Should return exception
		for (i = 0; i < 32; i ++)
		{
			System.out.println(("2^" + i + " = "  + recPow(i)));//Should return exception for n <= 31 
		}

	} 
}
