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
	int even=0;
	int odd=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}

		}
		System.out.println("even numbers "+even);
		System.out.println("odd numbers "+odd);
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
	
	int[][] addMatrix(int[][] x, int[][] y){
		if(x.length!=y.length || x[0].length!=y[0].length)
			return null;
		int[][] z= new int[x.length][x[0].length];
		
		for(int i=0;i<y.length;i++) {
			for(int j=0;j<y[i].length;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
	
	int[] rowWiseSum(int[][] mat ) {
		int[] sum= new int[mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
			sum[i]=sum[i]+mat[i][j];
			}
		}
		return sum;
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
	
	int[][] columnWiseReverse(int[][] mat) {
		for(int i=0;i<mat[0].length;i++) {
			int j=0;
			int k=mat.length-1;
			
			while(j<k) {
				int temp=mat[j][i];
				mat[j][i]=mat[k][i];
				mat[k][i]=temp;
				j++;
				k--;
			}
		}
		return mat;
	}
	
	int[][] rotateLeft(int[][] mat){
		int[][] trans=transpose(mat);
		int[][] res= columnWiseReverse(trans);
		return res;
	}
	
	int[][] reverseDiagonalElement(int[][] mat){
		int i=0;
		int j=mat.length-1;
		while(i<j) {
			int temp=mat[i][i];
			mat[i][i]=mat[j][j];
			mat[j][j]=temp;
			
			temp=mat[i][j];
			mat[i][j]=mat[j][i];
			mat[j][i]=temp;
			
			i++;
			j--;
		}
		return mat;
	}

}
