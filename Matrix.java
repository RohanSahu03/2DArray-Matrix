import java.util.Scanner;

public class Matrix {
	
	int[][] readMatrix() {
		System.out.println("enter order of matrix");
		
		Scanner sc = new Scanner(System.in);
		int r= sc.nextInt();
		int c= sc.nextInt();
		System.out.println("enter "+r*c+" elements : ");
		int[][] mat=new int[r][c];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}
	
	void displayMatrix(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void oddEvenMatrix(int[][] mat) {
	
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]%2==0) {
					System.out.println("even elements "+mat[i][j]);
				}
				else {
					System.out.println("odd elements "+mat[i][j]);
				}
			}

		}
	}
	
	void sumOfMatrixElement(int[][] mat) {
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				sum=sum+mat[i][j];
			}
		}
		System.out.println("sum of matrix element is "+sum);
	}
	
	void biggestElement(int[][] mat) {
		int big=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]>big) {
					big=mat[i][j];
				}
			}
		}
		System.out.println("biggest element is "+big);
	}
	
	int[][] transpose(int[][] mat){
		int[][]  tar  = new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				tar[j][i]=mat[i][j];
			}
		}
		return tar;
	}
	
	void rowWiseReverse(int [][]mat) {

		for(int i=0;i<mat.length;i++) {
			int j=0;
			int k= mat[i].length-1;
			
			while(j<=k) {
				int temp=mat[i][j];
			mat[i][j]=mat[i][k];
			mat[i][k]=temp;
			j++;
			k--;
			}
	}
	}
	
	

}
