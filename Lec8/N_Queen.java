package Lec8;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		QueenProblem(board, n, 0);

	}

	public static void QueenProblem(boolean[][] board, int tq, int row) {// tq---> Total Queen
		if (tq == 0) {
			Display(board);
			return;
		}
		if (row >= board.length) {
			return;
		}

		// 1st Queen kahan kahan Place kr skte hai
		for (int col = 0; col < board[0].length; col++) {

			if (isitsafe(board, row, col)) {
				board[row][col] = true;// Placed
				QueenProblem(board, tq - 1, row + 1);
				board[row][col] = false;// UNDO

			}

		}

	}

	private static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub

		// Col

		int r = row;
		while (r >= 0) {

			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		r = row;
		int c = col;

		// left Diagonal
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;

		}

		r = row;
		c = col;

		// Right Diagonal
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;

		}
		return true;

	}

	private static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println();

	}

}
