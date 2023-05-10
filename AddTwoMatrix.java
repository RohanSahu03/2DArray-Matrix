
public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix mt = new Matrix();
			int[][] x= mt.readMatrix();
			int[][] y= mt.readMatrix();
		int[][] z=	mt.addMatrix(x, y);
		if(z==null) 
			System.out.println("addition failed");
		else
			mt.displayMatrix(z);
	}

}
