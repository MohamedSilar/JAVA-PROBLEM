package arrays;

public class parmat {
	
	private static final int size = 4;
	static void partmat(int m[][], int row,int colum) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) 
				System.out.print(m[i][j] + " ");
		
		System.out.println("");
	}
	}
	static int[][] add(int a[][],int b[][],int size){
		int n=4;
		int i,j;
		int c[][] =new int [size][size];
		for(i=0;i<n;i++) 
			for(j=0;j<n;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		return c;
		
	}

	public static void main(String[] args) {
		int m=4;
		int A[][]={{1,1,1,1},
			      {2,2,2,2},
		          {3,3,3,3},
				  {4,4,4,4}};
		System.out.println("The first matrix is:");
		partmat(A,size,size);
		
		int B[][]={{1,1,1,1},
			      {2,2,2,2},
		          {3,3,3,3},
				  {4,4,4,4}};
		System.out.println("The second matrix is:");
		partmat(B,size,size);
		
		
		 int c[][] = add(A, B, size);
		
		System.out.println("The result matrix is:");
		partmat(c,size,size);
		
		
		
	}
		

	}


