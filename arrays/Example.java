package arrays;

public class Example {
	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] b ;
	    b = new int[2][];
		
		//int[][] b = new int[2][];
		
		b[0] = new int[3];
		b[1] = new int[4];
		
		b[0][0] = 11;
		b[0][1] = 12;
		b[0][2] = 13;
		
		b[1][0] = 14;
		b[1][1] = 15;
		b[1][2] = 16;
		b[1][3] = 17;
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
