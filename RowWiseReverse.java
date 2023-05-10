
public class RowWiseReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix mt = new Matrix();
		int[][] x=mt.readMatrix();
		mt.displayMatrix(x);
		mt.rowWiseReverse(x);
		mt.displayMatrix(x);

	}

}
