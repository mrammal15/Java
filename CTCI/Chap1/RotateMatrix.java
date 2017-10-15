
public class RotateMatrix {

	public void rotateMatrix(int [][] matrix) {
		int length = matrix.length;

		for(int row = 0; row < length / 2; row++) {
			int layer = length - row - 1;
			for(int col = row; col < layer; col++) {
				int temp = matrix[row][col];
				matrix[row][col] = matrix[length - col - 1][row];
				matrix[length - col - 1][row] = matrix[length - row - 1][length - col - 1];
				matrix[length - row - 1][length - col - 1] = matrix[col][length - row - 1];
				matrix[col][length - row - 1] = temp;
			}
		}
	}

}
