class FibonacciSeries {
	
	public static void printFibonacci(int a, int b, int n, int i) {
		
		if(i ==n ){
			//System.out.println(sum+i);
			return;
		}
		//System.out.println(n);
		
		int c = a + b;
		System.out.println(c);
		printFibonacci(b, c, n, i+1);
	}
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 5;
		//int sum = 0;
		printFibonacci(a, b, n, 0);
		
	}
}