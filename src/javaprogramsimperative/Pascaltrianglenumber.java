package javaprogramsimperative;

public class Pascaltrianglenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pascalTriangle(4);
		
		pascalTriangle(6);

	}
	
	public static void pascalTriangle (int n) {
		
		int i=0,j,k=0,num=n,binom=1;
		
		while(i<n) {
			j=num;
			while(j>1) {
				System.out.print(" ");
				j--;
			}
			k=0;
			
			while(k<=i) {
				if(i==0||k==0) {
					binom=1;
					System.out.print(binom+" ");
				}else {
					binom=binom*(i-k+1)/k;
					System.out.print(binom+" ");
				}
				k++;
			}
			System.out.println();
			i++;
			num--;
		}
		
		return;
	}

}
