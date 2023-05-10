
public class RowWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix mt = new Matrix();
		int[][] x= mt.readMatrix();
	int[] y=	mt.rowWiseSum(x);
	for(int i :y) {
		System.out.println(i);
	}

	}

}
