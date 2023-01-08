//Count total paths in maze to move from (0,0) to (n,m)
// 1) Move in right side or down not diagonally

class BackTrackingProblem2 {
	
	public static int searchMazePath(int moveDown, int moveRight, int row, int column) {
		
		//Base condition
		if( moveDown==row ||  moveRight==column) {
			return 0;
		}
		
		if( moveDown==row-1 &&  moveRight==column-1) {
			return 1;
		}
		
		int countDownPath = searchMazePath(moveDown+1, moveRight, row, column);
		int countRightPath = searchMazePath(moveDown, moveRight+1, row, column);
		
		return countDownPath + countRightPath;
	}
	
	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		int totalWays = searchMazePath(0,0,n,m);
		System.out.println(totalWays);
		
	}
}