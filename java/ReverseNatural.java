class ReverseNatural {
	
	public static int caluSumOfNumber(int n) {
		
		//Base condition
		if(n == 0) {
			return 0;
		}
		//recurssion
		System.out.println(n);
		int sum = caluSumOfNumber(n-1);
		int add = n + sum;
		return add;
	
		
	}
	public static void main(String[] args) {
		
		int i =5;
		int n =5;
		int z = caluSumOfNumber(n);
		System.out.println(z);
		
		
	}
}
