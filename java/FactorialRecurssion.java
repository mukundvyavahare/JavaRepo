class FactorialRecurssion {
	
	public static void calcFactoriol(int i, int n, int fact) {
		
		//base condition
		if(i == n)
		{
			System.out.println(i*fact);
			return;
		}
		
		//Kaam kerga
		//System.out.println(i);
		fact *= i;
		System.out.println(fact);
		calcFactoriol(i+1, n, fact);
	}
	
	
	public static void main(String[] args) {
			int n = 5;
			int i = 1;
			int fact = 1;
			calcFactoriol(i,n,fact);
			//System.out.println(fact);
	}
}