class NaturalRecurssion {
	
	public static void caluSumOfNumber(int i, int n, int sum) {
		
		//Base condition
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		//Implementation
		sum += i;
		//recurssion
		caluSumOfNumber(i+1, n, sum);
		
	}
	public static void main(String[] args) {
		
		int i =1;
		int n =5;
		int sum = 0;
		caluSumOfNumber(i, n, sum);
		
	}
}
