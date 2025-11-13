package javaprogramsimperative;

public class Transposetwodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= { {10,11,12},{13,14,15},{16,17,18} };
		
		int b[][]= { {4,5},{6,7} };
		
		Twodimensionalarrayprint.twoDimensionalArrayPrint(a);
		System.out.println();
		transposeTwoDimensionalArray(a);
		Twodimensionalarrayprint.twoDimensionalArrayPrint(a);
		System.out.println();
		
		Twodimensionalarrayprint.twoDimensionalArrayPrint(b);
		System.out.println();
		transposeTwoDimensionalArray(b);
		Twodimensionalarrayprint.twoDimensionalArrayPrint(b);
		System.out.println();

	}
	
	public static void transposeTwoDimensionalArray (int x[][]) {
		
		int i=0,j=0,temp;
		
		while(i<x.length) {
			j=i;
			while(j<x[i].length) {
				temp=x[i][j];
				x[i][j]=x[j][i];
				x[j][i]=temp;
				j++;
			}
			i++;
		}
		
		return;
	}

}
