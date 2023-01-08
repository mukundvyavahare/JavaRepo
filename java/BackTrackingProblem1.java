
//Place tiles of size 1mx in floor of size n*m.
class BackTrackingProblem1 {
	
	public static int placeTiles(int n, int m) {
		
		//Base Condition
		if(n == m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		
		
		//Kaam kerge
		//Place vertically m 
		int verticalPlace = placeTiles(n-m, m);
		
		//Place tiles horizontally
		int horizontalPlace = placeTiles(n-1, m);
		
		return verticalPlace+horizontalPlace;
		
		
	}
	
	public static void main(String[] args) {
		int n = 4;
		int m = 2;
		int totalWays = placeTiles(n,m);
		System.out.println(totalWays);
		
	}
}