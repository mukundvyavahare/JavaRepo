import java.util.ArrayList;
import java.util.List;

class SolutionNQueens {


	public static boolean isQueenSafe(int row, int col, char[][] board) {
		
		//Check all possible condition

		// Horizontally 
		for(int i=0;i<board.length; i++) {
			if(board[row][i] == 'Q') {
				return false;
			}
		}
		//Vertically 
		for(int j=0; j<board[0].length;j++) {
			if(board[j][col] == 'Q') {
				return false;
			}

		}

		//UpperLeft
		int ul = row;
		for(int c = col; c>=0 && ul>=0; c--, ul--) {
			if(board[ul][c] == 'Q') {
				return false;
			}
		}

		//upperRight
		int ur = row;
		for(int c=col; c<board.length && ur>=0; ur--, c++) {
			if(board[ur][c] == 'Q') {
				return false;
			}	
		}

		//lowerLeft
		int ll =row;
		for(int c=col; c>=0 && ll<board.length; ll++, c-- ) {
			if(board[ll][c] == 'Q') {
				return false;
			}	
		}

		//lower right
		int lr = row;
		for (int c=col; c<board.length && lr<board.length; c++, lr++) {
			if(board[lr][c] == 'Q') {
				return false;
			}	
		}
		return true;
	}

	public static void saveBoard(char[][] board, List<List<String>> allBoards) {
		
		String row = "";
		List<String> newBoard = new ArrayList<>();
		
		for(int i=0; i<board.length;i++) {
			row = "";
			for(int j=0; j <board[0].length; j++) {
				if(board[i][j] == 'Q') {
					row += 'Q';
				}
				else {
					row += '.';
				}
			}
			newBoard.add(row);
			
		}
		allBoards.add(newBoard);
	}

	public static void helper(char[][] board, List<List<String>> allBoards, int col) {
		
		//Base condition
		if(col == board.length) {
			saveBoard(board,allBoards);
			return;
		}


		//Traverse first first column - first row
		for(int row=0; row<board.length; row++) {

			if(isQueenSafe(row, col, board)) {
				//If yes add q in place
				board[row][col] = 'Q';
				helper(board, allBoards, col+1);
				//If No add . in place
				board[row][col] = '.';

			}

		}

	}
	
	
	public static List<List<String>> solution(int n) {
		//Given board
		//Input [ ["Q...", ""], [""] ]
		List<List<String>> allBoards = new ArrayList<>();
		//Travers bord via. row & column
		char[][] board = new char[n][n];

		//Create recursive function to place n queens in board
		helper(board, allBoards,0);
		return allBoards;

	}
	
	public static void main(String[] args) {
		int n = 4;
		List<List<String>> output = solution(4);
		System.out.println(output);
	}

}