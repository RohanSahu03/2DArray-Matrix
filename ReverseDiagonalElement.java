
public class ReverseDiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix mt = new Matrix();
		int[][] x=mt.readMatrix();
		mt.displayMatrix(x);
		mt.reverseDiagonalElement(x);
		System.out.println("after reverse");
		mt.displayMatrix(x);

	}

}
