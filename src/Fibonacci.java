
public class Fibonacci {
	
	static int fibofkt(int n)
	{
		if(n==0)
			return 0;
		if(n==1||n==2)
			return 1;
		
		return fibofkt(n-1) + fibofkt(n-2);
	}

	public static void main(String[] args)
	{
		int n = 8, vorfibo = 1, fibo = 1;
		
		if(n<3)
		{
			if(n==0) System.out.println("f("+n+") = 0");
			else System.out.println("f("+n+") = 1");
			
			return;
		}
		
		for(int i=3, tmp=fibo; i<=n; i++, tmp=fibo)
		{
			fibo += vorfibo;
			vorfibo = tmp;
		}
		
		System.out.println("f("+n+") = "+fibo);
		
		fibo = Fibonacci.fibofkt(n);
		
		System.out.println("Mit der rekursiven Fkt jetzt f("+n+") = "+fibo);

	}

}
