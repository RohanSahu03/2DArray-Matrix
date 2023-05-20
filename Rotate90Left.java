
public class Rotate90Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m = new Matrix();
		int[][] x= m.readMatrix();
		m.displayMatrix(x);
	int[][] res=	m.rotateLeft(x);
	System.out.println("after rotating 90 degree to left");
	m.displayMatrix(res);

	}

}
