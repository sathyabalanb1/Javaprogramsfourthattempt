package javaprogramsimperative;

public class Twodimensionalarrayprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { {1,2,3},{4,5,6,7},{8,9,10} };
		
		twoDimensionalArrayPrint(a);

	}
	
	public static void twoDimensionalArrayPrint (int x[][]) {
		
		int i=0,j=0;
		
		while(i<x.length) {
			j=0;
			while(j<x[i].length) {
				System.out.print(x[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}
		
		return;
	}

}
