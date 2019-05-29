package replHomeWorkProblems;

import java.util.Arrays;

public class ChessBoard134 {
	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE
		int i = 0;
		int k = 0;
		int num = 1;
		char letter = 'a';
		while (i < 8) {
			letter = 'a';
			k =0;
			while (k < 8) {
				chessBoard[i][k] = num+""+ letter;
				letter++;
				k++;
			}
			i++;
			num++;
		}

		/*
		 * char letter = 'a'; int num = 1; 
		 * for(int i = 0; i < chessBoard.length; i++) {
		 * num = 1; letter='a'; 
		 * for(int k = 0; k < chessBoard[i].length; k++) {
		 * chessBoard[i][k]=(""+i)+letter; letter++; num++; } }
		 */
		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));
	}
}
