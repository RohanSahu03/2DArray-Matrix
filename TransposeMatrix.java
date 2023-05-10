
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix mt = new Matrix();
		int[][] x=mt.readMatrix();
		mt.displayMatrix(x);
		int[][] res=mt.transpose(x);
		mt.displayMatrix(res);
	}

}
