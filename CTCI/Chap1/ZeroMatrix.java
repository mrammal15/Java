
public class ZeroMatrix {

	public void zeroMatrix(int [][] matrix) {
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		boolean [] zeroRow = new boolean [rowLen];
		boolean [] zeroCol = new boolean [colLen];
		
		for(int row = 0; row < rowLen; row++) {
			for(int col = 0; col < colLen; col++) {
				if(matrix[row][col] == 0) {
					zeroRow[row] = true;
					zeroCol[col] = true;
				}
			}
		}
		for(int i = 0; i < zeroRow.length; i++) {
			if(zeroRow[i]) {
				for(int j = 0; j < zeroCol.length; j++)
					matrix[i][j] = 0;
			}
		}
		for(int i = 0; i < zeroCol.length; i++) {
			if(zeroCol[i]) {
				for(int j = 0; j < zeroRow.length; j++)
					matrix[j][i] = 0;
			}
		}
	}
	
}
