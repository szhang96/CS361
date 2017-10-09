public class TailRecursion {
	public static int tailfact(int n, int x)
	//Tail recursion of factorial 
	//Used pseudo code from recursion slides
	{
		if(n == 0)
			return x;
		else
			return tailfact(n-1, n*x);
	}
}

